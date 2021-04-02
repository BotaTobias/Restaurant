package RestManag;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Restaurant {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField ChiBurg;
	private JTextField ChiBurgMeal;
	private JTextField CheeseBurg;
	private JTextField Rece;
	private JTextField calc;
	private JTextField Qty;
	private JTextField ConvBox;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
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
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(41, 31, 475, 285);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Chicken burger ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(22, 23, 115, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken burger meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChickenBurgerMeal.setBounds(22, 56, 150, 23);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseburger = new JLabel("Cheeseburger");
		lblCheeseburger.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCheeseburger.setBounds(22, 89, 115, 23);
		panel.add(lblCheeseburger);
		
		ChiBurg = new JTextField();
		ChiBurg.setBounds(211, 27, 191, 19);
		panel.add(ChiBurg);
		ChiBurg.setColumns(10);
		
		ChiBurgMeal = new JTextField();
		ChiBurgMeal.setColumns(10);
		ChiBurgMeal.setBounds(211, 60, 191, 19);
		panel.add(ChiBurgMeal);
		
		CheeseBurg = new JTextField();
		CheeseBurg.setColumns(10);
		CheeseBurg.setBounds(211, 93, 191, 19);
		panel.add(CheeseBurg);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDrink.setBounds(22, 158, 115, 23);
		panel.add(lblDrink);
		
		JComboBox comboDrinks = new JComboBox();
		comboDrinks.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboDrinks.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice ", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		comboDrinks.setBounds(22, 184, 140, 33);
		panel.add(comboDrinks);
		
		JCheckBox HomeDev = new JCheckBox("Home Delivery");
		HomeDev.setFont(new Font("Tahoma", Font.BOLD, 14));
		HomeDev.setBounds(22, 231, 191, 21);
		panel.add(HomeDev);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuantity.setBounds(211, 181, 115, 23);
		panel.add(lblQuantity);
		
		JCheckBox TaxTick = new JCheckBox("Tax");
		TaxTick.setFont(new Font("Tahoma", Font.BOLD, 14));
		TaxTick.setBounds(211, 233, 191, 21);
		panel.add(TaxTick);
		
		Qty = new JTextField();
		Qty.setColumns(10);
		Qty.setBounds(211, 206, 191, 19);
		panel.add(Qty);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 146, 443, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(537, 31, 299, 285);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboCash = new JComboBox();
		comboCash.setModel(new DefaultComboBoxModel(new String[] {"Choose one...", "USA", "Nigeria", "Kenya", "Canada", "Brazil", "Indonesia", "Philippines", "India"}));
		comboCash.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboCash.setBounds(75, 26, 140, 33);
		panel_1.add(comboCash);
		
		ConvBox = new JTextField();
		ConvBox.setBounds(75, 91, 140, 58);
		panel_1.add(ConvBox);
		ConvBox.setColumns(10);
		
		JLabel Conv = new JLabel("");
		Conv.setForeground(Color.RED);
		Conv.setFont(new Font("Tahoma", Font.BOLD, 14));
		Conv.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Conv.setBounds(75, 177, 140, 23);
		panel_1.add(Conv);
		
		JButton btnNewButton_6 = new JButton("Convert");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double NigNaira = 302.96;
				double USD = 1.52;
				double KenShill = 156.21;
				double BrazReal = 5.86;
				double CanD = 2.03;
				double IndRup = 100.68;
				double PhilPeso = 71.74;
				double IndoRup = 20746.75;
				
				double BritPound = Double.parseDouble(ConvBox.getText());
				
				if(comboCash.getSelectedItem().equals("Nigeria"))
				{
					String conv1 = String.format("%.2f", BritPound * NigNaira);
					Conv.setText(conv1);
				}
				
				if(comboCash.getSelectedItem().equals("USA"))
				{
					String conv2 = String.format("%.2f", BritPound * USD);
					Conv.setText(conv2);
				}
				
				if(comboCash.getSelectedItem().equals("Kenya"))
				{
					String conv3 = String.format("%.2f", BritPound * KenShill);
					Conv.setText(conv3);
				}
				
				if(comboCash.getSelectedItem().equals("Brazil"))
				{
					String conv4 = String.format("%.2f", BritPound * BrazReal);
					Conv.setText(conv4);
				}
				
				if(comboCash.getSelectedItem().equals("Canada"))
				{
					String conv5 = String.format("%.2f", BritPound * CanD);
					Conv.setText(conv5);
				}
				
				if(comboCash.getSelectedItem().equals("India"))
				{
					String conv6 = String.format("%.2f", BritPound * IndRup);
					Conv.setText(conv6);
				}
				
				if(comboCash.getSelectedItem().equals("Philippines"))
				{
					String conv7 = String.format("%.2f", BritPound * PhilPeso);
					Conv.setText(conv7);
				}
				
				if(comboCash.getSelectedItem().equals("Indonesia"))
				{
					String conv8 = String.format("%.2f", BritPound * IndoRup);
					Conv.setText(conv8);
				}
				
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_6.setBounds(25, 221, 105, 40);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Close");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConvBox.setText(null);
				Conv.setText(null);
				comboCash.setSelectedItem("Choose one...");
				
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_7.setBounds(167, 221, 94, 40);
		panel_1.add(btnNewButton_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(41, 326, 475, 191);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCostOfDrinks.setBounds(35, 49, 115, 23);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of meal ");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCostOfMeal.setBounds(35, 85, 115, 23);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCostOfDelivery.setBounds(35, 121, 115, 23);
		panel_2.add(lblCostOfDelivery);
		
		JLabel Drinks = new JLabel("");
		Drinks.setForeground(Color.RED);
		Drinks.setFont(new Font("Tahoma", Font.BOLD, 14));
		Drinks.setBounds(192, 49, 213, 23);
		panel_2.add(Drinks);
		Drinks.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel Meal = new JLabel("");
		Meal.setForeground(Color.RED);
		Meal.setFont(new Font("Tahoma", Font.BOLD, 14));
		Meal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Meal.setBounds(192, 85, 213, 23);
		panel_2.add(Meal);
		
		JLabel CostDel = new JLabel("");
		CostDel.setForeground(Color.RED);
		CostDel.setFont(new Font("Tahoma", Font.BOLD, 14));
		CostDel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		CostDel.setBounds(192, 121, 213, 23);
		panel_2.add(CostDel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(537, 326, 299, 191);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTax.setBounds(26, 50, 115, 23);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubTotal.setBounds(26, 81, 115, 23);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotal.setBounds(26, 114, 115, 23);
		panel_3.add(lblTotal);
		
		JLabel Tax = new JLabel("");
		Tax.setForeground(Color.RED);
		Tax.setFont(new Font("Tahoma", Font.BOLD, 14));
		Tax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Tax.setBounds(127, 50, 162, 23);
		panel_3.add(Tax);
		
		JLabel Sub = new JLabel("");
		Sub.setForeground(Color.RED);
		Sub.setFont(new Font("Tahoma", Font.BOLD, 14));
		Sub.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Sub.setBounds(127, 81, 162, 23);
		panel_3.add(Sub);
		
		JLabel Total = new JLabel("");
		Total.setForeground(Color.RED);
		Total.setFont(new Font("Tahoma", Font.BOLD, 14));
		Total.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Total.setBounds(127, 114, 162, 23);
		panel_3.add(Total);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(846, 31, 379, 486);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 37, 334, 424);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		Rece = new JTextField();
		Rece.setBounds(10, 10, 309, 377);
		panel_6.add(Rece);
		Rece.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(26, 139, 50, 50);
		panel_6.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(26, 108, 85, 21);
		panel_6.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(87, 108, 85, 21);
		panel_6.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(126, 126, 85, 21);
		panel_6.add(btnNewButton_4);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("<");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				if(calc.getText().length() > 0)
				{
					StringBuilder strB = new StringBuilder(calc.getText());
					strB.deleteCharAt(calc.getText().length() - 1);
					backspace = strB.toString();
					calc.setText(backspace);
				}
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBounds(20, 91, 50, 50);
		panel_7.add(btnNewButton_5);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calc.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnC.setBounds(80, 91, 50, 50);
		panel_7.add(btnC);
		
		JButton button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(calc.getText());
				calc.setText("");
				operations = "%";
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBounds(140, 91, 50, 50);
		panel_7.add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(calc.getText());
				calc.setText("");
				operations = "+";
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_2.setBounds(200, 91, 50, 50);
		panel_7.add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = calc.getText() + button_3.getText();
				calc.setText(EnterNumber);
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_3.setBounds(20, 151, 50, 50);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = calc.getText() + button_4.getText();
				calc.setText(EnterNumber);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_4.setBounds(80, 151, 50, 50);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = calc.getText() + button_5.getText();
				calc.setText(EnterNumber);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_5.setBounds(140, 151, 50, 50);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(calc.getText());
				calc.setText("");
				operations = "-";
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_6.setBounds(200, 151, 50, 50);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = calc.getText() + button_7.getText();
				calc.setText(EnterNumber);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_7.setBounds(20, 211, 50, 50);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber = calc.getText() + button_8.getText();
				calc.setText(EnterNumber);
			}		
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_8.setBounds(80, 211, 50, 50);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = calc.getText() + button_9.getText();
				calc.setText(EnterNumber);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(140, 211, 50, 50);
		panel_7.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(calc.getText());
				calc.setText("");
				operations = "*";
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_10.setBounds(200, 211, 50, 50);
		panel_7.add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = calc.getText() + button_11.getText();
				calc.setText(EnterNumber);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_11.setBounds(20, 271, 50, 50);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = calc.getText() + button_12.getText();
				calc.setText(EnterNumber);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_12.setBounds(80, 271, 50, 50);
		panel_7.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = calc.getText() + button_13.getText();
				calc.setText(EnterNumber);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_13.setBounds(140, 271, 50, 50);
		panel_7.add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(calc.getText());
				calc.setText("");
				operations = "/";
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_14.setBounds(200, 271, 50, 50);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton("0");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = calc.getText() + button_15.getText();
				calc.setText(EnterNumber);
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_15.setBounds(20, 331, 50, 50);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = calc.getText() + button_16.getText();
				calc.setText(EnterNumber);
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_16.setBounds(80, 331, 50, 50);
		panel_7.add(button_16);
		
		JButton btnAbs = new JButton("M");
		btnAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(calc.getText()));
				ops = ops * (-1);
				calc.setText(String.valueOf(ops));
			}
		});
		btnAbs.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAbs.setBounds(140, 331, 50, 50);
		panel_7.add(btnAbs);
		
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(calc.getText());
				
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					calc.setText(answer);
				}
				
				if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					calc.setText(answer);
				}
				
				if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					calc.setText(answer);
				}
				
				if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					calc.setText(answer);
				}
				
				if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					calc.setText(answer);
				}
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_18.setBounds(200, 331, 50, 50);
		panel_7.add(button_18);
		
		calc = new JTextField();
		calc.setHorizontalAlignment(SwingConstants.RIGHT);
		calc.setBounds(20, 34, 230, 47);
		panel_7.add(calc);
		calc.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(41, 527, 1184, 115);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double CB = Double.parseDouble(ChiBurg.getText());
				double iCB = 2.39;
				double Burger;
				Burger = (CB * iCB);
				String pMeal = String.format("%.2f", Burger);
				Meal.setText(pMeal);
				
				double CBM = Double.parseDouble(ChiBurgMeal.getText());
				double iCBM = 4.39;
				double BurgMeal;
				BurgMeal = (CBM * iCBM);
				String cbMeal = String.format("%.2f", BurgMeal + Burger);
				Meal.setText(cbMeal);
				
				double Cheese = Double.parseDouble(CheeseBurg.getText());
				double iCheese = 3.39;
				double CheeseMeal;
				CheeseMeal = (Cheese * iCheese);
				String cheese = String.format("%.2f", CheeseMeal + BurgMeal + Burger);
				Meal.setText(cheese);
				
				
				//-------------------------------Drinks---------------------------------------------
				double drinks = Double.parseDouble(Qty.getText());
				double Tea = 1.20 * drinks;
				double IceTea = 0.90 * drinks;
				double Coffee = 2.50 * drinks;
				double IceCoffee = 1.10 * drinks;
				double Cola = 2.10 * drinks;
				double Coke = 1.60 * drinks;
				double Orange = 1.70 * drinks;
				double AppleJuice = 1.99 * drinks;
				
				if(comboDrinks.getSelectedItem().equals("Tea"))
				{
					String cTea = String.format("%.2f", Tea);
					Drinks.setText(cTea);
				}
				
				if(comboDrinks.getSelectedItem().equals("Ice Tea"))
				{
					String cIT = String.format("%.2f", IceTea);
					Drinks.setText(cIT);
				}
				
				if(comboDrinks.getSelectedItem().equals("Coffee"))
				{
					String cCof = String.format("%.2f", Coffee);
					Drinks.setText(cCof);
				}
				
				if(comboDrinks.getSelectedItem().equals("Ice Coffee"))
				{
					String cICof = String.format("%.2f", IceCoffee);
					Drinks.setText(cICof);
				}
				
				if(comboDrinks.getSelectedItem().equals("Cola"))
				{
					String cCol = String.format("%.2f", Cola);
					Drinks.setText(cCol);
				}
				
				if(comboDrinks.getSelectedItem().equals("Coke"))
				{
					String cCok = String.format("%.2f", Coke);
					Drinks.setText(cCok);
				}
					
				if(comboDrinks.getSelectedItem().equals("Orange"))
				{
					String cOr = String.format("%.2f", Orange);
					Drinks.setText(cOr);
				}
				
				if(comboDrinks.getSelectedItem().equals("Apple Juice"))
				{
					String cAppJu = String.format("%.2f", AppleJuice);
					Drinks.setText(cAppJu);
				}
				
				if(comboDrinks.getSelectedItem().equals("Select a drink"))
				{
					String cAppJu = String.format("%.2f", AppleJuice);
					Drinks.setText("0");
				}
				
				
				//------------------------Home Delivery--------------------------
				double delivery = 3.39;
				if(HomeDev.isSelected())
				{
					String deliv = String.format("%.2f", delivery);
					CostDel.setText(deliv);
				}
				else
				{
					CostDel.setText("0");
				}
				
				
				//=========================Tax==============================
				double total1 = Double.parseDouble(Drinks.getText());
				double total2 = Double.parseDouble(Meal.getText());
				double total3 = Double.parseDouble(CostDel.getText());
				double alltotal = (total1 + total2 + total3) / 100;
				if(TaxTick.isSelected())
				{
					String total = String.format("%.2f", alltotal);
					Tax.setText(total);
				}
				
				
				//==========================Total============================
			    double total4 = Double.parseDouble(Tax.getText());
				String taxtotal = String.format("£ %.2f", total4);
				Tax.setText(taxtotal); 
				
			    double subTotal = (total1 + total2 + total3);
				String subt = String.format("£ %.2f", subTotal);
				Sub.setText(subt);
				
				double finalTotal = (total1 + total2 + total3 + total4);
				String finalcost = String.format("£ %.2f", finalTotal);
				Total.setText(finalcost);
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTotal.setBounds(213, 37, 105, 40);
		panel_5.add(btnTotal);
		
		JButton btnReset = new JButton("Receipt");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double qty1 = Double.parseDouble(ChiBurg.getText());
				double qty2 = Double.parseDouble(ChiBurgMeal.getText());
				double qty3 = Double.parseDouble(CheeseBurg.getText());
				Rece.setText("\t\n Restaurant Management Systems:\n\n" + "Chicken BurgerL\t\t" + qty1 + "\n Chicken Burger Meal:\t\t" + qty2 + "\n Cheese Burger:\t\t" + qty3 + "\n\n Thanks for using Job Estimator!");

			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(366, 37, 105, 40);
		panel_5.add(btnReset);
		
		JButton btnReset_1 = new JButton("Reset");
		btnReset_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CostDel.setText(null);
				Sub.setText(null);
				Total.setText(null);
				Tax.setText(null);
				Conv.setText(null);
				CostDel.setText(null);
				Drinks.setText(null);
				Meal.setText("0");
				Sub.setText(null);
				Tax.setText(null);
				Total.setText(null);
				ChiBurg.setText(null);
				ChiBurgMeal.setText(null);
				CheeseBurg.setText(null);
				Qty.setText(null);
				ConvBox.setText(null);
				comboDrinks.setSelectedItem("Select a drink");
				comboCash.setSelectedItem("Choose one...");
				
			}
		});
		btnReset_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset_1.setBounds(528, 37, 105, 40);
		panel_5.add(btnReset_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(709, 37, 105, 40);
		panel_5.add(btnExit);
		
		JLabel lblNewLabel_1 = new JLabel("Loan management systems");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(507, 10, 253, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Show Message");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		
	}
}
