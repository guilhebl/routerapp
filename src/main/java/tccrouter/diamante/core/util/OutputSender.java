package tccrouter.diamante.core.util;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class OutputSender
{

    public static final int INFORMATION_MESSAGE = 1;
    public static final int ERROR_MESSAGE = 0;
    public static final int WARNING_MESSAGE = 2;
    public static final int QUESTION_MESSAGE = 3;
    public static final int PLAIN_MESSAGE = -1;

    public OutputSender()
    {
    }

    public static void showMessageDialog(final Object message)
    {
        (new Thread() {

            public void run()
            {
                JOptionPane.showMessageDialog(null, message);
            }

        }).start();
    }

    public static void showMessageDialog(final Object message, final String title, final int messageType)
    {
        (new Thread() {

            public void run()
            {
                JOptionPane.showMessageDialog(null, message, title, messageType);
            }

        }).start();
    }

    public static void showMessageDialog(final Object message, final String title, final int messageType, final Icon icon)
    {
        (new Thread() {

            public void run()
            {
                JOptionPane.showMessageDialog(null, message, title, messageType, icon);
            }

        }).start();
    }
}
