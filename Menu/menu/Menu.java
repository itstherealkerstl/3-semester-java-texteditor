package menu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Beschreiben Sie hier die Klasse Menu.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Menu
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Menu
     */
public Menu()
    {
        JFrame frame = new JFrame();
        frame.setTitle("Übung 1");
        frame.setResizable(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocation(200,200);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);       

        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);


        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        JMenuItem copyItem = new JMenuItem("Copy");
        editMenu.add(copyItem);

        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(pasteItem);

        JMenuItem cutItem = new JMenuItem("Cut");
        editMenu.add(cutItem);

        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);




        JEditorPane mainPane = new JEditorPane();
        mainPane.setContentType("text/plain");
        JScrollPane scrollPane = new JScrollPane(mainPane,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(scrollPane);

        exitItem.setAccelerator(KeyStroke.getKeyStroke('Q',InputEvent.CTRL_DOWN_MASK));
        exitItem.addActionListener((actionEvent)->{System.exit(0);});

        copyItem.setAccelerator(KeyStroke.getKeyStroke('C',InputEvent.CTRL_DOWN_MASK));
        copyItem.addActionListener((actionEvent)->{mainPane.copy();});

        pasteItem.setAccelerator(KeyStroke.getKeyStroke('V',InputEvent.CTRL_DOWN_MASK));
        pasteItem.addActionListener((actionEvent)->{mainPane.paste();});

        cutItem.setAccelerator(KeyStroke.getKeyStroke('X',InputEvent.CTRL_DOWN_MASK));
        cutItem.addActionListener((actionEvent)->{mainPane.cut();});

        aboutItem.addActionListener((actionEvent)->{JOptionPane.showMessageDialog(null,"© 2021, Sebastian Koller, Kerstin Höbart, Alexandra Heinzl, Süß Monika, Köller Madlen","About",JOptionPane.INFORMATION_MESSAGE);});


        frame.setVisible(true);
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
}
