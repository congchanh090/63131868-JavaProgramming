import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setBounds(33, 49, 108, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setBounds(33, 87, 108, 27);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(151, 49, 292, 27);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setBounds(151, 90, 292, 27);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xư lý cộng ở đây 
				//Viet lệnh ở 1 thủ tục / hàm rồi gọi  ở đây
				Hamxulycong() ; 
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(64, 143, 89, 35);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xư lý trừ ở đây 
				//Viet lệnh ở 1 thủ tục / hàm rồi gọi  ở đây
				Hamxulytru() ; 
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(163, 142, 89, 37);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xư lý nhân ở đây 
				//Viet lệnh ở 1 thủ tục / hàm rồi gọi  ở đây
				Hamxulynhan() ; 
			}
			
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(262, 142, 99, 37);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xư lý chia ở đây 
				//Viet lệnh ở 1 thủ tục / hàm rồi gọi  ở đây
				Hamxulychia() ; 

			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(371, 142, 89, 37);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán :");
		lblKtQuTnh.setBounds(33, 211, 108, 27);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(151, 211, 292, 27);
		contentPane.add(txtKetQua);
	} //het ham tao 
	void Hamxulycong() {
		//Lay du lieu tu dieu khien
		String str_soA = txtA.getText() ; 
		String str_soB = txtB.getText() ; 
		//CHUYEN KIEU
		double soA  = Double.parseDouble(str_soA) ; 
		double soB  = Double.parseDouble(str_soB) ; 
		//TINH TOAN
		double tong = soA+soB ; 
		//Dua ra hien thi dieu khien 
		txtKetQua.setText(String.valueOf(tong));

	}
	void Hamxulytru() {
		//Lay du lieu tu dieu khien
				String str_soA = txtA.getText() ; 
				String str_soB = txtB.getText() ; 
				//CHUYEN KIEU
				double soA  = Double.parseDouble(str_soA) ; 
				double soB  = Double.parseDouble(str_soB) ; 
				//TINH TOAN
				double tong = soA-soB ; 
				//Dua ra hien thi dieu khien 
				txtKetQua.setText(String.valueOf(tong));
		
	}
	void Hamxulynhan() {
		//Lay du lieu tu dieu khien
				String str_soA = txtA.getText() ; 
				String str_soB = txtB.getText() ; 
				//CHUYEN KIEU
				double soA  = Double.parseDouble(str_soA) ; 
				double soB  = Double.parseDouble(str_soB) ; 
				//TINH TOAN
				double tong = soA*soB ; 
				//Dua ra hien thi dieu khien 
				txtKetQua.setText(String.valueOf(tong));
	}
	void Hamxulychia() {
		//Lay du lieu tu dieu khien
				String str_soA = txtA.getText() ; 
				String str_soB = txtB.getText() ; 
				//CHUYEN KIEU
				double soA  = Double.parseDouble(str_soA) ; 
				double soB  = Double.parseDouble(str_soB) ; 
				//TINH TOAN
				double tong = soA/soB ; 
				//Dua ra hien thi dieu khien 
				txtKetQua.setText(String.valueOf(tong));
	}
	

}
