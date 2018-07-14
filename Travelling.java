package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Travelling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubtotal;
	private JTextField txtTotal;
	private JTextField Class;
	private JTextField Ticket;
	private JTextField Adult;
	private JTextField Child;
	private JTextField From;
	private JTextField To;
	private JTextField Date;
	private JTextField Time;
	private JTextField TicketNo;
	private JTextField Price;
	private JTextField Route;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Travelling() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1570, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBounds(33, 13, 1486, 82);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblNewLabel = new JLabel("NJ Transit Ticket System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Type");
		lblNewLabel_1.setBounds(211, 127, 234, 52);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 37));
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard ");
		rdbtnStandard.setBounds(49, 225, 183, 25);
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setBounds(49, 320, 169, 39);
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setBounds(49, 414, 209, 49);
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setBounds(266, 310, 253, 58);
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setBounds(266, 218, 221, 39);
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(523, 225, 127, 25);
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(523, 327, 127, 25);
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(rdbtnStandard);
		frame.getContentPane().add(rdbtnEconomy);
		frame.getContentPane().add(rdbtnFirstClass);
		frame.getContentPane().add(rdbtnReturnTicket);
		frame.getContentPane().add(rdbtnSingleTicket);
		frame.getContentPane().add(rdbtnAdult);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox cmbDestination = new JComboBox();
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "New York", "Boston", "Philadelphia", "Washington D.C", "Newark", "New Haven"}));
		cmbDestination.setFont(new Font("Tahoma", Font.BOLD, 30));
		cmbDestination.setToolTipText("");
		cmbDestination.setBounds(338, 419, 281, 39);
		frame.getContentPane().add(cmbDestination);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(49, 192, 601, 6);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(49, 469, 601, 6);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tax");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_2.setBounds(49, 504, 75, 42);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblSubtotal.setBounds(49, 612, 159, 45);
		frame.getContentPane().add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblTotal.setBounds(49, 735, 106, 29);
		frame.getContentPane().add(lblTotal);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.BOLD, 35));
		txtTax.setBounds(220, 488, 352, 83);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubtotal = new JTextField();
		txtSubtotal.setFont(new Font("Tahoma", Font.BOLD, 35));
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(220, 597, 352, 83);
		frame.getContentPane().add(txtSubtotal);
		
		txtTotal = new JTextField();
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 35));
		txtTotal.setColumns(10);
		txtTotal.setBounds(220, 712, 352, 83);
		frame.getContentPane().add(txtTotal);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(49, 808, 570, 6);
		frame.getContentPane().add(separator_2);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				double MilesK4=24.10;
				double MilesK8=25.78;
				double MilesK12=31.10;
				double MilesK20=45.23;
				double MilesK30=55.98;
				double MilesK50=59.67;
				double totalCost,std=40,eco=20,fclass=100;
				
				//------------Single Ticket for Adults-------------
				
				if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Newark")){
					totalCost=1.07*(std*MilesK4)/100;
					String sTax=String.format("$%.2f", 0.07*(std*MilesK4)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (std*MilesK4)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New York")){
					totalCost=1.07*(std*MilesK8)/100;
					String sTax=String.format("$%.2f", 0.07*(std*MilesK8)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (std*MilesK8)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New Haven")){
					totalCost=1.07*(std*MilesK12)/100;
					String sTax=String.format("$%.2f", 0.07*(std*MilesK12)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (std*MilesK12)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Philadelphia")){
					totalCost=1.07*(std*MilesK20)/100;
					String sTax=String.format("$%.2f", 0.07*(std*MilesK20)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (std*MilesK20)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Boston")){
					totalCost=1.07*(std*MilesK30)/100;
					String sTax=String.format("$%.2f", 0.07*(std*MilesK30)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (std*MilesK30)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Washington D.C")){
					totalCost=1.07*(std*MilesK50)/100;
					String sTax=String.format("$%.2f", 0.07*(std*MilesK50)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (std*MilesK50)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
				}else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Destination")){
					Class.setText(null);
					Ticket.setText(null);
					Adult.setText(null);
					Child.setText(null);
					From.setText(null);
					To.setText(null);
					Date.setText(null);
					Time.setText(null);
					TicketNo.setText(null);
					Price.setText(null);
					Route.setText(null);
					txtTax.setText(null);
					txtSubtotal.setText(null);
					txtTotal.setText(null);
					
				}
				
				
				if((rdbtnEconomy.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Newark")){
					totalCost=1.07*(eco*MilesK4)/100;
					String sTax=String.format("$%.2f", 0.07*(eco*MilesK4)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f",(eco*MilesK4)/100 );
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnEconomy.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New York")){
					totalCost=1.07*(eco*MilesK8)/100;
					String sTax=String.format("$%.2f", 0.07*(eco*MilesK8)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (eco*MilesK8)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnEconomy.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New Haven")){
					totalCost=1.07*(eco*MilesK12)/100;
					String sTax=String.format("$%.2f", 0.07*(eco*MilesK12)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (eco*MilesK12)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnEconomy.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Philadelphia")){
					totalCost=1.07*(eco*MilesK20)/100;
					String sTax=String.format("$%.2f", 0.07*(eco*MilesK20)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (eco*MilesK20)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnEconomy.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Boston")){
					totalCost=1.07*(eco*MilesK30)/100;
					String sTax=String.format("$%.2f", 0.07*(eco*MilesK30)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (eco*MilesK30)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnEconomy.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Washington D.C")){
					totalCost=1.07*(eco*MilesK50)/100;
					String sTax=String.format("$%.2f", 0.07*(eco*MilesK50)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (eco*MilesK50)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
				}else if((rdbtnEconomy.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Destination")){
					Class.setText(null);
					Ticket.setText(null);
					Adult.setText(null);
					Child.setText(null);
					From.setText(null);
					To.setText(null);
					Date.setText(null);
					Time.setText(null);
					TicketNo.setText(null);
					Price.setText(null);
					Route.setText(null);
					txtTax.setText(null);
					txtSubtotal.setText(null);
					txtTotal.setText(null);
					
				}
				
				if((rdbtnFirstClass.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Newark")){
					totalCost=1.07*(fclass*MilesK4)/100;
					String sTax=String.format("$%.2f", 0.07*(fclass*MilesK4)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (fclass*MilesK4)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New York")){
					totalCost=1.07*(fclass*MilesK8)/100;
					String sTax=String.format("$%.2f", 0.07*(fclass*MilesK8)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (fclass*MilesK8)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New Haven")){
					totalCost=1.07*(fclass*MilesK12)/100;
					String sTax=String.format("$%.2f", 0.07*(fclass*MilesK12)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (fclass*MilesK12)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Philadelphia")){
					totalCost=1.07*(fclass*MilesK20)/100;
					String sTax=String.format("$%.2f", 0.07*(fclass*MilesK20)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f",(fclass*MilesK20)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Boston")){
					totalCost=1.07*(fclass*MilesK30)/100;
					String sTax=String.format("$%.2f", 0.07*(fclass*MilesK30)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (fclass*MilesK30)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Washington D.C")){
					totalCost=1.07*(fclass*MilesK50)/100;
					String sTax=String.format("$%.2f", 0.07*(fclass*MilesK50)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (fclass*MilesK50)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Destination")){
					Class.setText(null);
					Ticket.setText(null);
					Adult.setText(null);
					Child.setText(null);
					From.setText(null);
					To.setText(null);
					Date.setText(null);
					Time.setText(null);
					TicketNo.setText(null);
					Price.setText(null);
					Route.setText(null);
					txtTax.setText(null);
					txtSubtotal.setText(null);
					txtTotal.setText(null);
				}
				
			//-----------------Return Ticket for Adults-------------------
				if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Newark")){
					totalCost=1.07*(2*std*MilesK4)/100;
					String sTax=String.format("$%.2f", 0.07*(2*std*MilesK4)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*std*MilesK4)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New York")){
					totalCost=1.07*(2*std*MilesK8)/100;
					String sTax=String.format("$%.2f", 0.07*(2*std*MilesK8)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*std*MilesK8)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New Haven")){
					totalCost=1.07*(2*std*MilesK12)/100;
					String sTax=String.format("$%.2f", 0.07*(2*std*MilesK12)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*std*MilesK12)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Philadelphia")){
					totalCost=1.07*(2*std*MilesK20)/100;
					String sTax=String.format("$%.2f", 0.07*(2*std*MilesK20)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*std*MilesK20)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Boston")){
					totalCost=1.07*(2*std*MilesK30)/100;
					String sTax=String.format("$%.2f", 0.07*(2*std*MilesK30)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*std*MilesK30)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Washington D.C")){
					totalCost=1.07*(2*std*MilesK50)/100;
					String sTax=String.format("$%.2f", 0.07*(2*std*MilesK50)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*std*MilesK50)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
				}else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Destination")){
					Class.setText(null);
					Ticket.setText(null);
					Adult.setText(null);
					Child.setText(null);
					From.setText(null);
					To.setText(null);
					Date.setText(null);
					Time.setText(null);
					TicketNo.setText(null);
					Price.setText(null);
					Route.setText(null);
					txtTax.setText(null);
					txtSubtotal.setText(null);
					txtTotal.setText(null);
					
				}
				
				
				if((rdbtnEconomy.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Newark")){
					totalCost=1.07*(2*eco*MilesK4)/100;
					String sTax=String.format("$%.2f", 0.07*(2*eco*MilesK4)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f",(2*eco*MilesK4)/100 );
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnEconomy.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New York")){
					totalCost=1.07*(2*eco*MilesK8)/100;
					String sTax=String.format("$%.2f", 0.07*(2*eco*MilesK8)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*eco*MilesK8)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnEconomy.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New Haven")){
					totalCost=1.07*(2*eco*MilesK12)/100;
					String sTax=String.format("$%.2f", 0.07*(2*eco*MilesK12)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*eco*MilesK12)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnEconomy.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Philadelphia")){
					totalCost=1.07*(2*eco*MilesK20)/100;
					String sTax=String.format("$%.2f", 0.07*(2*eco*MilesK20)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*eco*MilesK20)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnEconomy.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Boston")){
					totalCost=1.07*(2*eco*MilesK30)/100;
					String sTax=String.format("$%.2f", 0.07*(2*eco*MilesK30)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*eco*MilesK30)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnEconomy.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Washington D.C")){
					totalCost=1.07*(2*eco*MilesK50)/100;
					String sTax=String.format("$%.2f", 0.07*(2*eco*MilesK50)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*eco*MilesK50)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
				}else if((rdbtnEconomy.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Destination")){
					Class.setText(null);
					Ticket.setText(null);
					Adult.setText(null);
					Child.setText(null);
					From.setText(null);
					To.setText(null);
					Date.setText(null);
					Time.setText(null);
					TicketNo.setText(null);
					Price.setText(null);
					Route.setText(null);
					txtTax.setText(null);
					txtSubtotal.setText(null);
					txtTotal.setText(null);
					
				}
				
				if((rdbtnFirstClass.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Newark")){
					totalCost=1.07*(2*fclass*MilesK4)/100;
					String sTax=String.format("$%.2f", 0.07*(2*fclass*MilesK4)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*fclass*MilesK4)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New York")){
					totalCost=1.07*(2*fclass*MilesK8)/100;
					String sTax=String.format("$%.2f", 0.07*(2*fclass*MilesK8)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*fclass*MilesK8)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("New Haven")){
					totalCost=1.07*(2*fclass*MilesK12)/100;
					String sTax=String.format("$%.2f", 0.07*(2*fclass*MilesK12)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*fclass*MilesK12)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Philadelphia")){
					totalCost=1.07*(2*fclass*MilesK20)/100;
					String sTax=String.format("$%.2f", 0.07*(2*fclass*MilesK20)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f",(2*fclass*MilesK20)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Boston")){
					totalCost=1.07*(2*fclass*MilesK30)/100;
					String sTax=String.format("$%.2f", 0.07*(2*fclass*MilesK30)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*fclass*MilesK30)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
					
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Washington D.C")){
					totalCost=1.07*(2*fclass*MilesK50)/100;
					String sTax=String.format("$%.2f", 0.07*(2*fclass*MilesK50)/100);
					txtTax.setText(sTax);
					String subTotal=String.format("$%.2f", (2*fclass*MilesK50)/100);
					txtSubtotal.setText(subTotal);
					String Total=String.format("$%.2f", totalCost);
					txtTotal.setText(Total);
					Price.setText(Total);
					Class.setText("STD");
					Ticket.setText("ONE WAY");
					Adult.setText("ONE");
					Child.setText("NIL");
				}else if((rdbtnFirstClass.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())
						&&cmbDestination.getSelectedItem().equals("Destination")){
					Class.setText(null);
					Ticket.setText(null);
					Adult.setText(null);
					Child.setText(null);
					From.setText(null);
					To.setText(null);
					Date.setText(null);
					Time.setText(null);
					TicketNo.setText(null);
					Price.setText(null);
					Route.setText(null);
					txtTax.setText(null);
					txtSubtotal.setText(null);
					txtTotal.setText(null);
				}
				
				
			}
			
		});
			
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//------------------Time-----------------	
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				Time.setText(tTime.format(timer.getTime()));
				
			//------------------Date------------------
				SimpleDateFormat tDate=new SimpleDateFormat("dd:MM:yyyy");
				Date.setText(tDate.format(timer.getTime()));
				
				From.setText("Harrison *");
				To.setText((String)cmbDestination.getSelectedItem()+" *");
				
			//------------------Random Number Generator---------------
				int num;
				String q="";
				num=1325+(int)(Math.random()*4238);
				q=q+num+1325;
				TicketNo.setText(q);
				
			//---------------------------------------------------------	
				
				int decider=(int)(Math.random()*6+1);
				if(decider==1){
				    Route.setText("H1");
				}else if(decider==2){
					Route.setText("B1");;
				}else if(decider==3){
					Route.setText("F1");;
				}else {
					Route.setText("J1");;
				}
			}
		});
		btnNewButton.setToolTipText("Total Cost of Tickets");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(49, 827, 144, 64);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setToolTipText("Reset System");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTax.setText(null);
				txtSubtotal.setText(null);
				txtTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				cmbDestination.setSelectedItem("Destination");
				Class.setText(null);
				Ticket.setText(null);
				Adult.setText(null);
				Child.setText(null);
				From.setText(null);
				To.setText(null);
				Date.setText(null);
				Time.setText(null);
				TicketNo.setText(null);
				Price.setText(null);
				Route.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReset.setBounds(266, 827, 144, 64);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit System");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Ticketing System",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
				;
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExit.setBounds(477, 827, 144, 64);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(623, 372, -9, 6);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(633, 353, -9, 6);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(658, 108, 2, 832);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(33, 108, 2, 832);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(1517, 108, 2, 832);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(672, 192, 833, 6);
		frame.getContentPane().add(separator_8);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblClass.setBounds(719, 137, 106, 42);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblTicket.setBounds(940, 137, 119, 42);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblAdult.setBounds(1150, 137, 106, 42);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblChild.setBounds(1378, 137, 96, 42);
		frame.getContentPane().add(lblChild);
		
		Class = new JTextField();
		Class.setFont(new Font("Tahoma", Font.BOLD, 35));
		Class.setColumns(10);
		Class.setBounds(684, 211, 169, 71);
		frame.getContentPane().add(Class);
		
		Ticket = new JTextField();
		Ticket.setFont(new Font("Tahoma", Font.BOLD, 35));
		Ticket.setColumns(10);
		Ticket.setBounds(897, 211, 195, 71);
		frame.getContentPane().add(Ticket);
		
		Adult = new JTextField();
		Adult.setFont(new Font("Tahoma", Font.BOLD, 35));
		Adult.setColumns(10);
		Adult.setBounds(1118, 211, 184, 71);
		frame.getContentPane().add(Adult);
		
		Child = new JTextField();
		Child.setFont(new Font("Tahoma", Font.BOLD, 35));
		Child.setColumns(10);
		Child.setBounds(1349, 211, 156, 71);
		frame.getContentPane().add(Child);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblFrom.setBounds(672, 319, 75, 42);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblTo.setBounds(672, 485, 75, 42);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblDate.setBounds(672, 664, 75, 42);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblTime.setBounds(672, 810, 75, 42);
		frame.getContentPane().add(lblTime);
		
		From = new JTextField();
		From.setFont(new Font("Tahoma", Font.BOLD, 35));
		From.setColumns(10);
		From.setBounds(759, 304, 333, 76);
		frame.getContentPane().add(From);
		
		To = new JTextField();
		To.setFont(new Font("Tahoma", Font.BOLD, 35));
		To.setColumns(10);
		To.setBounds(759, 470, 333, 76);
		frame.getContentPane().add(To);
		
		Date = new JTextField();
		Date.setFont(new Font("Tahoma", Font.BOLD, 35));
		Date.setColumns(10);
		Date.setBounds(759, 649, 333, 76);
		frame.getContentPane().add(Date);
		
		Time = new JTextField();
		Time.setFont(new Font("Tahoma", Font.BOLD, 35));
		Time.setColumns(10);
		Time.setBounds(759, 795, 333, 76);
		frame.getContentPane().add(Time);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(983, 192, -1, 488);
		frame.getContentPane().add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setBounds(1104, 207, 2, 733);
		frame.getContentPane().add(separator_10);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblTicketNo.setBounds(1146, 295, 159, 42);
		frame.getContentPane().add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblPrice.setBounds(1146, 488, 75, 42);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblRoute.setBounds(1146, 707, 84, 42);
		frame.getContentPane().add(lblRoute);
		
		TicketNo = new JTextField();
		TicketNo.setFont(new Font("Tahoma", Font.BOLD, 35));
		TicketNo.setColumns(10);
		TicketNo.setBounds(1118, 336, 387, 77);
		frame.getContentPane().add(TicketNo);
		
		Price = new JTextField();
		Price.setFont(new Font("Tahoma", Font.BOLD, 35));
		Price.setColumns(10);
		Price.setBounds(1118, 549, 387, 77);
		frame.getContentPane().add(Price);
		
		Route = new JTextField();
		Route.setFont(new Font("Tahoma", Font.BOLD, 35));
		Route.setColumns(10);
		Route.setBounds(1118, 762, 387, 77);
		frame.getContentPane().add(Route);
			
	}	
}




