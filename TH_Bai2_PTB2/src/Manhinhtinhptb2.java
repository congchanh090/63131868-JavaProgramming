import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manhinhtinhptb2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manhinhtinhptb2 frame = new Manhinhtinhptb2();
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
	public Manhinhtinhptb2() {
		setTitle("Chương trình tính PTB2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập vào số A");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(24, 11, 89, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập vào số B");
		lblNewLabel_1.setBounds(24, 53, 76, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nhập vào số C");
		lblNewLabel_2.setBounds(24, 96, 76, 19);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Kết quả");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code tinh ket qua o day 
				Hamtinhptb2(); 
				
			}
		});
		btnNewButton.setBounds(24, 148, 89, 23);
		contentPane.add(btnNewButton);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtA.setBounds(148, 11, 100, 23);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtB.setBounds(148, 49, 100, 23);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtC.setBounds(148, 92, 100, 23);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtKetQua.setBounds(144, 149, 237, 47);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}
	void Hamtinhptb2() {
		String str_soA = txtA.getText() ; 
		String str_soB = txtB.getText() ; 
		String str_soC = txtC.getText() ; 
		//CHUYEN KIEU

		double a = Double.parseDouble(str_soA);
		double b = Double.parseDouble(str_soB);
		double c = Double.parseDouble(str_soC);

		//TINH TOAN
		
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            txtKetQua.setText("x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            txtKetQua.setText("x = " + x);
        } else {
        	txtKetQua.setText("No real roots");
        }
	}


}
