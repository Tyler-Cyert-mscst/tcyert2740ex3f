package ex3f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JTextField empIDTextField;
	private JTextField empNameTextField;
	private JTextField posTextField;
	private JList employeeList;
	private DefaultListModel employeeListModel;
	private JComboBox deptComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
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
	public EmployeeForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 389, 168);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();			//added manual 
		employeeList = new JList(employeeListModel);
		scrollPane.setViewportView(employeeList);
		
		JLabel lblEmployeeName = new JLabel("Employee ID:");
		lblEmployeeName.setBounds(10, 201, 88, 14);
		contentPane.add(lblEmployeeName);
		
		JLabel lblEmployeeName_1 = new JLabel("Employee name:");
		lblEmployeeName_1.setBounds(10, 226, 117, 14);
		contentPane.add(lblEmployeeName_1);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(10, 251, 88, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(10, 276, 46, 14);
		contentPane.add(lblPosition);
		
		empIDTextField = new JTextField();
		empIDTextField.setText("101");
		lblEmployeeName.setLabelFor(empIDTextField);
		empIDTextField.setBounds(108, 198, 86, 20);
		contentPane.add(empIDTextField);
		empIDTextField.setColumns(10);
		
		empNameTextField = new JTextField();
		empNameTextField.setText("Mark Swanson");
		lblEmployeeName_1.setLabelFor(empNameTextField);
		empNameTextField.setBounds(108, 223, 130, 20);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		posTextField = new JTextField();
		posTextField.setText("Software Engineer");
		lblPosition.setLabelFor(posTextField);
		posTextField.setBounds(108, 273, 130, 20);
		contentPane.add(posTextField);
		posTextField.setColumns(10);
		
		deptComboBox = new JComboBox();
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenence"}));
		lblDepartment.setLabelFor(deptComboBox);
		deptComboBox.setBounds(108, 248, 130, 20);
		contentPane.add(deptComboBox);
		
		JButton noArgButton = new JButton("No Arg");
		noArgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_noArgButton_actionPerformed(arg0);
			}
		});
		noArgButton.setBounds(64, 304, 89, 23);
		contentPane.add(noArgButton);
		
		JButton twoArgButton = new JButton("2 Arg");
		twoArgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_twoArgButton_actionPerformed(e);
			}
		});
		twoArgButton.setBounds(163, 304, 89, 23);
		contentPane.add(twoArgButton);
		
		JButton fourArgButton = new JButton("4 Arg");
		fourArgButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_fourArgButton_actionPerformed(e);
			}
		});
		fourArgButton.setBounds(262, 304, 89, 23);
		contentPane.add(fourArgButton);
	}
	protected void do_noArgButton_actionPerformed(ActionEvent arg0) {
		Employee emp = new Employee();
		employeeListModel.addElement(emp);
	}
	protected void do_twoArgButton_actionPerformed(ActionEvent e) {
		Employee emp = new Employee(Integer.parseInt(empIDTextField.getText()), empNameTextField.getText());
		employeeListModel.addElement(emp);
	}
	protected void do_fourArgButton_actionPerformed(ActionEvent e) {
		String dept = (String) deptComboBox.getSelectedItem();
		Employee emp = new Employee(Integer.parseInt(empIDTextField.getText()), empNameTextField.getText(), dept, posTextField.getText());
		employeeListModel.addElement(emp);	
	}
}
