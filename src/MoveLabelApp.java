import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MoveLabelApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MoveLabelApp().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Move the Label!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        JLabel label = new JLabel("Move Me!");
        label.setBounds(200, 200, 100, 30);
        frame.add(label);

        int moveBy = 10;

        InputMap inputMap = frame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = frame.getRootPane().getActionMap();

        inputMap.put(KeyStroke.getKeyStroke("UP"), "moveUp");
        inputMap.put(KeyStroke.getKeyStroke("DOWN"), "moveDown");
        inputMap.put(KeyStroke.getKeyStroke("LEFT"), "moveLeft");
        inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "moveRight");

        actionMap.put("moveUp", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX(), label.getY() - moveBy);
            }
        });

        actionMap.put("moveDown", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX(), label.getY() + moveBy);
            }
        });

        actionMap.put("moveLeft", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX() - moveBy, label.getY());
            }
        });

        actionMap.put("moveRight", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX() + moveBy, label.getY());
            }
        });

        frame.setVisible(true);
    }
}
