package awt.com;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAwt {

	public SimpleAwt() {
		Frame frame = new Frame("Welcome to my world");

		Label label = new Label("Name: ");
		label.setBounds(50, 50, 50, 30);
		label.setBackground(Color.RED);
		TextField txtfield = new TextField();
		txtfield.setBounds(150, 50, 200, 30);

		Button button = new Button("okkkkk");
		button.setBounds(50, 85, 80, 20);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String inputText= txtfield.getText();
				System.out.println("My name is "+inputText);
			}
		});

		frame.add(label);
		frame.add(button);
		frame.add(txtfield);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleAwt obj = new SimpleAwt();

	}

}
