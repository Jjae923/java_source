package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class GameTable extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTable table;
	private JTextField txtName;
	private JTextField txtScore;
	private DefaultTableModel model;
	private GameDAO dao = new GameDAO();
	private JButton btnSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameTable frame = new GameTable();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("명예의 전당");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		panel.add(lblNewLabel_1);
		
		txtName = new JTextField();
		panel.add(txtName);
		txtName.setColumns(5);
		
		JLabel lblNewLabel_2 = new JLabel("점수");
		panel.add(lblNewLabel_2);
		
		txtScore = new JTextField();
		panel.add(txtScore);
		txtScore.setColumns(5);
		
		btnSubmit = new JButton("제출");
		btnSubmit.addActionListener(this);
		panel.add(btnSubmit);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(getModel());
		list();
		scrollPane.setViewportView(table);
	}

	public DefaultTableModel getModel() {
		String columnNames[] = {"이름","점수"};
		model = new DefaultTableModel(columnNames,0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		return model;
	}
	
	public void list() {
		Vector<GameVO> vecList = dao.scoreList();
		
		for(GameVO vo:vecList) {
			Object[] objList = {vo.getName(), vo.getScore()};
			model.addRow(objList);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("제출")) {
			GameVO vo = new GameVO();
			String name = txtName.getText();
			String score = txtScore.getText();
			
			if(name.equals("") || score.equals("")) {
				JOptionPane.showMessageDialog(this, "입력 데이터를 확인해주세요", "확인", JOptionPane.WARNING_MESSAGE, null);
			}else {
				vo.setName(name);
				vo.setScore(Integer.parseInt(score));
				
				int result = dao.scoreInsert(vo);
				
				if(result>0) {
					
					model.setNumRows(0);
					list();
				}
				model = (DefaultTableModel) table.getModel();
				
				Object rowDate[] = {name, score};
				
				txtName.setText("");
				txtScore.setText("");
			}
		}
	}
}
