import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private JLabel imageLabel;
    private ButtonGroup group;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

    
        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

   
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);

  
        imageLabel = new JLabel();
        add(imageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pet = "";
        String imagePath = "";

        if (e.getSource() == birdButton) {
            pet = "Bird";
            imagePath = "images/bird.png";
        } else if (e.getSource() == catButton) {
            pet = "Cat";
            imagePath = "images/cat.png";
        } else if (e.getSource() == dogButton) {
            pet = "Dog";
            imagePath = "images/dog.png";
        } else if (e.getSource() == rabbitButton) {
            pet = "Rabbit";
            imagePath = "images/rabbit.png";
        } else if (e.getSource() == pigButton) {
            pet = "Pig";
            imagePath = "images/pig.png";
        }

       
        JOptionPane.showMessageDialog(this, "You selected: " + pet);

     
        ImageIcon icon = new ImageIcon(imagePath);
        imageLabel.setIcon(icon);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
