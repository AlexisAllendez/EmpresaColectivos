
/**
 *
 * @author adam
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JTableWithMultipleFilters {
    public static void main(String[] args) {
        // Create a JFrame to hold the table and the comboboxes
        JFrame frame = new JFrame("JTable Example with Multiple Filters");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a table model with some sample data
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{
                        {"John", 25, "Engineer"},
                        {"Anna", 30, "Designer"},
                        {"Mike", 35, "Developer"},
                        {"Sara", 25, "Developer"},
                        {"Paul", 30, "Engineer"}
                },
                new Object[]{"Name", "Age", "Profession"}
        );

        // Create the table with the model
        JTable table = new JTable(model);

        // Set up a TableRowSorter and associate it with the table model
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        // Create JComboBoxes for selecting ages and professions
        JComboBox<Integer> ageComboBox = new JComboBox<>(new Integer[]{null, 25, 30, 35});
        JComboBox<String> professionComboBox = new JComboBox<>(new String[]{null, "Engineer", "Designer", "Developer"});

        // Add an ActionListener to the comboboxes to filter the table based on the selected age and profession
        ActionListener filterListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<RowFilter<Object, Object>> filters = new ArrayList<>();

                Integer selectedAge = (Integer) ageComboBox.getSelectedItem();
                if (selectedAge != null) {
                    filters.add(RowFilter.numberFilter(RowFilter.ComparisonType.EQUAL, selectedAge, 1));
                }

                String selectedProfession = (String) professionComboBox.getSelectedItem();
                if (selectedProfession != null && !selectedProfession.isEmpty()) {
                    filters.add(RowFilter.regexFilter(selectedProfession, 2));
                }

                sorter.setRowFilter(RowFilter.andFilter(filters));
            }
        };

        ageComboBox.addActionListener(filterListener);
        professionComboBox.addActionListener(filterListener);

        // Add the comboboxes and table to the frame
        JPanel panel = new JPanel();
        panel.add(new JLabel("Age:"));
        panel.add(ageComboBox);
        panel.add(new JLabel("Profession:"));
        panel.add(professionComboBox);
        frame.add(panel, "North");
        frame.add(new JScrollPane(table), "Center");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

