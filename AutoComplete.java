
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalTextFieldUI;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;



public class AutoComplete extends MetalTextFieldUI {

    private JTextField textField;
    private Border border;
    private int round = 15;
    private List<String> items = new ArrayList<>();

    public AutoComplete(JTextField textField) {
        this.textField = textField;
        border = new Border(10);
        textField.setBorder(border);
        textField.setOpaque(false);
        textField.setSelectedTextColor(Color.WHITE);
        textField.setSelectionColor(new Color(54, 189, 248));
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent fe) {
                border.setColor(new Color(128, 189, 255));
                textField.repaint();
            }

            @Override
            public void focusLost(FocusEvent fe) {
                border.setColor(new Color(206, 212, 218));
                textField.repaint();
            }
        });
        AutoCompleteDecorator.decorate(textField, items, false);
    }

    @Override
    protected void paintBackground(Graphics grphcs) {
        if (textField.isOpaque()) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(textField.getBackground());
            g2.fillRoundRect(0, 0, textField.getWidth(), textField.getHeight(), round, round);
            g2.dispose();
        }
    }
    public void setItems(List<String> items) {
        this.items = items;
        AutoCompleteDecorator.decorate(textField, items, false);
    }

    private class Border extends EmptyBorder {

        private Color focusColor = new Color(128, 189, 255);
        private Color color = new Color(206, 212, 218);

        public Border(int border) {
            super(border, border, border, border);
        }


        @Override
        public void paintBorder(Component cmpnt, Graphics grphcs, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (cmpnt.isFocusOwner()) {
                g2.setColor(focusColor);
            } else {
                g2.setColor(color);
            }
            g2.drawRoundRect(x, y, width - 1, height - 1, round, round);
            g2.dispose();
        }
        

        public void setColor(Color color) {
            this.color = color;
        }


    }
}

