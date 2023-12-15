import java.util.*;
public class new {
public static void admin_menu() {
  JFrame f = new JFrame("Admin Functions");
  f.setSize(600, 200);
  f.setLayout(null);

  Connection connection = connect();

  // Combined user/reset button with radio buttons
  JButton manageUser = new JButton("Manage User");
  manageUser.setBounds(450, 60, 120, 25);
  f.add(manageUser);

  ButtonGroup bg = new ButtonGroup();
  JRadioButton createRadio = new JRadioButton("Create");
  JRadioButton resetRadio = new JRadioButton("Reset");
  bg.add(createRadio);
  bg.add(resetRadio);

  // Dynamic frame elements for user/book management
  JLabel l1 = new JLabel("Username/Book Name");
  l1.setVisible(false);
  JTextField f1 = new JTextField();
  f1.setVisible(false);
  JLabel l2 = new JLabel("Password/Genre");
  l2.setVisible(false);
  JTextField f2 = new JTextField();
  f2.setVisible(false);
  JLabel l3 = new JLabel("Price");
  l3.setVisible(false);
  JTextField f3 = new JTextField();
  f3.setVisible(false);

  JButton submitButton = new JButton("Submit");
  submitButton.setBounds(130, 130, 80, 25);
  f.add(submitButton);

  submitButton.addActionListener(e -> {
    String action = bg.getSelection().getActionCommand();
    String username = f1.getText();
    String password = f2.getText();
    String bookName = f1.getText();
    String genre = f2.getText();
    int price = Integer.parseInt(f3.getText());

    try {
      Statement stmt = connection.createStatement();
      stmt.executeUpdate("USE LIBRARY");

      if (action.equals("Create")) {
        stmt.executeUpdate("INSERT INTO USERS(USERNAME,PASSWORD) VALUES ('" + username + "','" + password + "')");
      } else if (action.equals("Reset")) {
        stmt.executeUpdate("UPDATE USERS SET PASSWORD='' WHERE USERNAME='" + username + "'");
      } else if (action.equals("Create Book")) {
        stmt.executeUpdate("INSERT INTO BOOKS(BNAME,GENRE,PRICE) VALUES ('" + bookName + "','" + genre + "'," + price + ")");
      } else if (action.equals("Update Book")) {
        // ... update book logic
      }

      JOptionPane.showMessageDialog(null, "Success!");
      f1.setText("");
      f2.setText("");
      f3.setText("");
    } catch (SQLException e1) {
      e1.printStackTrace();
    }
  });

  // Dynamically switch elements for different actions
  manageUser.addActionListener(e -> {
    l1.setText("Username");
    l2.setText("Password");
    l1.setVisible(true);
    l2.setVisible(true);
    f1.setVisible(true);
    f2.setVisible(true);
    l3.setVisible(false);
    f3.setVisible(false);
  });

  JButton viewBooks = new JButton("View Books");
  viewBooks.setBounds(20, 20, 120, 25);
  f.add(viewBooks);

  // ... other buttons and functionality

  f.setVisible(true);
  }
}
