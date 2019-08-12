package characters;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * @see http://stackoverflow.com/questions/7702697
 */
public class GridButtonPanel {

	private int row = 7;
	private int col = 5;
	private final List<JButton> list = new ArrayList<JButton>();
	private ArrayList<String> matrixValueStrings = new ArrayList<String>();
	private JFrame f;

	private class Line {
		private int line;
		private String content;

		public Line(int line, String content) {
			this.line = line;
			this.content = content;
		}

		public int getLine() {
			return line;
		}

		public String getContent() {
			return content;
		}

	}

	public GridButtonPanel(int row2, int col2) {
		// TODO Auto-generated constructor stub
		row = row2;
		col = col2;
	}

	public GridButtonPanel() {
		// TODO Auto-generated constructor stub
	}

	private JButton getGridButton(int r, int c) {
		int index = r * col + c;
		// System.out.println("Index de " + r + " " + c + " = " + index);
		return list.get(index);
	}

	private JButton createGridButton(final int row, final int col) {
		final JButton b = new JButton();
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JButton gb = GridButtonPanel.this.getGridButton(row, col);
				gb.setBackground(Color.RED);
				System.out.println("matrix[" + col + "][" + row + "].turnOn();");
				matrixValueStrings.add("\t\t\t\t\t" + "matrix[" + col + "][" + row + "].turnOn();");
			}
		});
		return b;
	}

	private JPanel createGridPanel() {
		JPanel p = new JPanel(new GridLayout(row, col));

		for (int i = 0; i < row * col; i++) {
			int row = i / this.col;
			int col = i % this.col;
			// System.out.println("row: " + row + " col: " + col);
			JButton gb = createGridButton(row, col);
			gb.setBackground(Color.WHITE);
			list.add(gb);
			p.add(gb);
		}
		return p;
	}
	
	private void closeCurrentWindow() {
		f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				new GridButtonPanel(row, col).display();
			}
		});
		f.repaint();
	}

	private Line FileSearch(char character) {
		int start = -1;
		try {
			Scanner scan = new Scanner(new File("src/characters/Character.java"));
			var count = 0;
			while (scan.hasNext()) {
				String line = scan.nextLine().toLowerCase().toString();
				if (line.contains("case '" + character + "':")) {
					scan.close();
					return new Line(count, "case '" + character + "':");
				}
				if (line.contains("switch (c) {")) {
					start = count;
				}
				count++;
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Line(start, "START");
	}

	private void display() {

		f = new JFrame("GridButton @Modified by Joao Pinto - 2019");
		JPanel panel = new JPanel(new GridLayout());
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel resetpanel = new JPanel(new GridLayout(4, 1));
		final JButton add = new JButton("add");
		add.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						list.get(i * col + j).setBackground(Color.WHITE);
					}
				}
				System.out.println("\n \n \n \n \n");
			}
		});
		JButton changeGridSize = new JButton("Change Grid Size");
		changeGridSize.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				final JButton okay = new JButton("Ok");
				class aux {
					protected JOptionPane getOptionPane(JComponent parent) {
						JOptionPane pane = null;
						if (!(parent instanceof JOptionPane)) {
							pane = getOptionPane((JComponent) parent.getParent());
						} else {
							pane = (JOptionPane) parent;
						}
						return pane;
					}
				}
				okay.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane pane = new aux().getOptionPane((JComponent) e.getSource());
						pane.setValue(okay);
					}
				});
				okay.setEnabled(false);
				JLabel widthLabel = new JLabel("Width:");
				final JTextField widthTextField = new JTextField();
				JLabel heightLabel = new JLabel("Height:");
				final JTextField heightTextField = new JTextField();
				heightTextField.addKeyListener(new KeyListener() {

					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								System.out.println("its here");
								if (!heightTextField.getText().equals("") && !widthTextField.getText().equals(""))
									okay.setEnabled(true);
							}
						});
					}

					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								System.out.println("its here");
								if (!heightTextField.getText().equals("") && !widthTextField.getText().equals(""))
									okay.setEnabled(true);
							}
						});
					}
				});
				widthTextField.addKeyListener(new KeyListener() {

					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								if (!heightTextField.getText().equals("") && !widthTextField.getText().equals(""))
									okay.setEnabled(true);
							}
						});
					}

					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub

					}

					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						SwingUtilities.invokeLater(new Runnable() {
							public void run() {
								System.out.println("its here");
								if (!heightTextField.getText().equals("") && !widthTextField.getText().equals(""))
									okay.setEnabled(true);
							}
						});
					}
				});
				Object[] optionDialog = { widthLabel, widthTextField, heightLabel, heightTextField };
				int input = JOptionPane.showOptionDialog(null, optionDialog, "Change Grid Size",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { okay }, okay);
				if (input == 0) {
					row = Integer.parseInt(widthTextField.getText());
					col = Integer.parseInt(heightTextField.getText());
					closeCurrentWindow();
				}
			}
		});

		JLabel caseText = new JLabel("Grid:["+col+"]["+row+"] Enter the char:", SwingConstants.CENTER);
		final JTextField caseTextField = new JTextField();
		caseTextField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				SwingUtilities.invokeLater(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						if (!caseTextField.getText().equals("")) {
							add.setEnabled(true);
							caseTextField.setEditable(false);
						} else {
							add.setEnabled(false);
							caseTextField.setEditable(true);
						}
						f.repaint();
					}
				});
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		caseTextField.setMinimumSize(new Dimension(20, 30));
		caseTextField.setHorizontalAlignment(JTextField.CENTER);
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						Path path = Path.of("src/characters/Character.java");
						Line line = FileSearch(caseTextField.getText().toCharArray()[0]);
						matrixValueStrings.add(0, "\t\t\t\tcase '" + caseTextField.getText() + "':");
						if (line.getLine() == -1) {
							throw new IllegalStateException("There was an error in reading the character.java file");
						} else if (line.getContent().equals("START")) {
							try {
								Scanner scanner = new Scanner(new File("src/characters/Character.java"));
								int counter = 0;
								ArrayList<String> stringArray = new ArrayList<String>();
								ArrayList<String> tempArrayList = new ArrayList<String>();
								while (scanner.hasNext()) {
									String s = scanner.nextLine();
									stringArray.add(s);
								}
								scanner.close();
								System.out.println(stringArray.get(line.getLine() - 1));
								System.out.println("PixelBW[][] matrix = new PixelBW[" + col + "][" + row + "];");
								if (stringArray.get(line.getLine() - 1)
										.contains("PixelBW[][] matrix = new PixelBW[" + col + "][" + row + "];")) {
									counter = 0;
									for (int i = 0; i < stringArray.size() + matrixValueStrings.size(); i++) {
										if (i < line.getLine() + 1) {
											tempArrayList.add(i, stringArray.get(i));
										} else {
											if (counter < matrixValueStrings.size()) {
												tempArrayList.add(i, "\n");
												counter++;
											} else {
												tempArrayList.add(i, stringArray.get(i - counter));
											}
										}
									}
									System.out.println("chegou ao 2ºif line.getLine()=" + line.getLine()
											+ " matrixValueStrings size= " + matrixValueStrings.size());
									counter = 0;
									for (int i = line.getLine() + 1; i < matrixValueStrings.size() + line.getLine()
											+ 1; i++) {
										System.out.println("i= " + i + " matrixValueStrings.get(i)="
												+ matrixValueStrings.get(counter));
										tempArrayList.set(i, matrixValueStrings.get(counter));
										counter++;
									}
									stringArray = tempArrayList;
									String temp = "";
									for (int i = 0; i < stringArray.size(); i++) {
										temp = temp + "\n" + stringArray.get(i);
									}
									Files.write(path, temp.getBytes());
								} else
									System.out.println("Esse caracter já foi introduzido");

							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						//change so that it doesn't open a new window a make a new object!
						closeCurrentWindow();
					}

				});
			}
		});
		add.setEnabled(false);
		resetpanel.add(caseText);
		resetpanel.add(caseTextField);
		resetpanel.add(add);
		resetpanel.add(changeGridSize);
		panel.add(resetpanel);
		panel.add(createGridPanel());
		f.add(panel);
		// f.pack();
		f.setSize(600, 600);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				new GridButtonPanel().display();
			}
		});
	}
}