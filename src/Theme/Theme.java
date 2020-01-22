package Theme;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Components.Heading;
import Components.PasswordField;
import Components.Table;
import Components.Textfield;

@SuppressWarnings("serial")
public class Theme extends JPanel{
	
//	admin_panel.setForeground(Color.BLACK);
//	user_list.setForeground(Color.BLACK);
//	albumedit.setForeground(Color.BLACK);
//	textArea.setForeground(Color.BLACK);
//	listPanel.setBackground(Colors.LTBackground);
//	panelH.line.setBackground(Colors.LTBlue);
//	panelH.label.setForeground(Color.BLACK);
//	searchBar.setBackground(Colors.LTBackground);
//	table.setForeground(Color.BLACK);
//	table.setBackground(Colors.LTBackground);
//	table.getTableHeader().setBackground(Colors.LTBackground);
//	table.setSelectionBackground(Color.decode("#F6F6F6"));
//	table.setSelectionForeground(Color.BLACK);
	
	public void Add_add(boolean dark, String Parent) {
		if (dark == true) {
			if (Parent == "Add_add") {
				this.setBackground(Colors.DTBackground); //main-bg
				Heading top = (Heading) this.getComponent(2); //title
				top.label.setForeground(Colors.DTText);
				top.line.setBackground(Colors.DTPurple);
				Textfield albumTitle = (Textfield) this.getComponent(3);
				albumTitle.handleFocus(true, albumTitle.type, albumTitle.name);
				Textfield title = (Textfield) this.getComponent(4);
				title.handleFocus(true, title.type, title.name);
				Textfield author = (Textfield) this.getComponent(5);
				author.handleFocus(true, author.type, author.name);
				Textfield genre = (Textfield) this.getComponent(6);
				genre.handleFocus(true, genre.type, genre.name);
				Textfield date = (Textfield) this.getComponent(7);
				date.handleFocus(true, date.type, date.name);
				Textfield img = (Textfield) this.getComponent(8);
				img.handleFocus(true, img.type, img.name);
				
				
				JLabel descLabel = (JLabel) this.getComponent(9);
				JTextArea desc = (JTextArea) this.getComponent(10);
				desc.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						desc.setBorder(BorderFactory.createMatteBorder(3,3,3,3, Colors.DTActive));
						descLabel.setForeground(Colors.DTActive);
						desc.setForeground(Colors.DTText);
					}
					@Override
					public void focusLost(FocusEvent e) {
						desc.setBorder(BorderFactory.createMatteBorder(3,3,3,3, Colors.DTInactive));
						descLabel.setForeground(Colors.DTInactive);
						desc.setForeground(Colors.DTInactive);
					}
				});
				
				this.getComponent(11).setBackground(Colors.DTPurple);
			}
		} else {
			if (Parent == "Add_add") {
				this.setBackground(Colors.LTBackground); //main-bg
				Heading top = (Heading) this.getComponent(2); //title
				top.label.setForeground(Color.BLACK);
				top.line.setBackground(Colors.LTBlue);
				Textfield albumTitle = (Textfield) this.getComponent(3);
				albumTitle.handleFocus(false, albumTitle.type, albumTitle.name);
				Textfield title = (Textfield) this.getComponent(4);
				title.handleFocus(false, title.type, title.name);
				Textfield author = (Textfield) this.getComponent(5);
				author.handleFocus(false, author.type, author.name);
				Textfield genre = (Textfield) this.getComponent(6);
				genre.handleFocus(false, genre.type, genre.name);
				Textfield date = (Textfield) this.getComponent(7);
				date.handleFocus(false, date.type, date.name);
				Textfield img = (Textfield) this.getComponent(8);
				img.handleFocus(false, img.type, img.name);
				
				JLabel descLabel = (JLabel) this.getComponent(9);
				JTextArea desc = (JTextArea) this.getComponent(10);
				desc.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						desc.setBorder(BorderFactory.createMatteBorder(3,3,3,3, Colors.LTBlue));
						descLabel.setForeground(Colors.LTBlue);
						desc.setForeground(Color.BLACK);
					}
					@Override
					public void focusLost(FocusEvent e) {
						desc.setBorder(BorderFactory.createMatteBorder(3,3,3,3, Colors.inactive));
						descLabel.setForeground(Colors.inactive);
						desc.setForeground(Colors.inactive);
					}
				});
				
				this.getComponent(11).setBackground(Colors.LTBlue);
			}
		}
	}
	
	public void MainWindow(boolean dark, String Parent) {
		if (dark == true) {
			if (Parent == "MainWindow") {
				this.setBackground(Colors.DTBackground);
				this.getComponent(1).setBackground(Colors.DTPurple);
				JPanel topPanel = (JPanel) this.getComponent(2);
				topPanel.setBackground(Colors.DTPanel);
				topPanel.getComponent(0).setForeground(Colors.DTText);
				topPanel.getComponent(2).setForeground(Colors.DTText);
				topPanel.getComponent(3).setForeground(Colors.DTText);
				topPanel.getComponent(4).setForeground(Colors.DTText);
				
				JPanel listPanel = (JPanel) this.getComponent(3);
				listPanel.setBackground(Colors.DTPanel);
				Heading listPanelH = (Heading) listPanel.getComponent(1);
				listPanelH.line.setBackground(Colors.DTPurple);
				listPanelH.label.setForeground(Colors.DTText);
				
				JScrollPane listPanelScroll = (JScrollPane) listPanel.getComponent(0);
				Table listPanelTable = (Table) listPanelScroll.getViewport().getComponent(0);
				listPanelTable.setForeground(Colors.DTText);
				listPanelTable.setBackground(Colors.DTPanel);
				listPanelTable.setSelectionBackground(Colors.DTisSelected);
				listPanelTable.setSelectionForeground(Colors.DTText);
				listPanelTable.getTableHeader().setBackground(Colors.DTPanel);
				
				JPanel infoPanel = (JPanel) this.getComponent(4);
				infoPanel.setBackground(Colors.DTPanel);
				infoPanel.getComponent(1).setForeground(Colors.DTText);
				infoPanel.getComponent(2).setForeground(Colors.DTPurple);
				infoPanel.getComponent(3).setForeground(Colors.DTPurple);
				infoPanel.getComponent(4).setForeground(Colors.DTPurple);
				infoPanel.getComponent(5).setForeground(Colors.DTPurple);
				infoPanel.getComponent(6).setForeground(Colors.DTPurple);
				infoPanel.getComponent(7).setForeground(Colors.DTText);
				infoPanel.getComponent(8).setForeground(Colors.DTText);
				infoPanel.getComponent(9).setForeground(Colors.DTText);
				infoPanel.getComponent(10).setForeground(Colors.DTText);
				Heading infoPanelHeading = (Heading) infoPanel.getComponent(11);
				infoPanelHeading.label.setForeground(Colors.DTText);
				infoPanelHeading.line.setBackground(Colors.DTPurple);
				
				
				
				
				this.getComponent(5).setBackground(Colors.DTPanel);
			}
		} else {
				if (Parent == "MainWindow") {
					this.setBackground(Color.decode("#F6F6F6"));
					this.getComponent(1).setBackground(Colors.LTBlue);
					JPanel topPanel = (JPanel) this.getComponent(2);
					topPanel.setBackground(Colors.LTBackground);
					topPanel.getComponent(0).setForeground(Color.BLACK); //username (toppanel)
					topPanel.getComponent(2).setForeground(Color.BLACK);
					topPanel.getComponent(3).setForeground(Color.BLACK);
					topPanel.getComponent(4).setForeground(Color.BLACK);
					JPanel listPanel = (JPanel) this.getComponent(3);
					listPanel.setBackground(Colors.LTBackground);
					Heading listPanelH = (Heading) listPanel.getComponent(1);
					listPanelH.line.setBackground(Colors.LTBlue);
					listPanelH.label.setForeground(Color.BLACK);

					JScrollPane listPanelScroll = (JScrollPane) listPanel.getComponent(0);
					Table listPanelTable = (Table) listPanelScroll.getViewport().getComponent(0);
					listPanelTable.setForeground(Color.BLACK);
					listPanelTable.setBackground(Colors.LTBackground);
					listPanelTable.setSelectionBackground(Color.decode("#F6F6F6"));
					listPanelTable.setSelectionForeground(Color.BLACK);
					listPanelTable.getTableHeader().setBackground(Colors.LTBackground);
					
					JPanel infoPanel = (JPanel) this.getComponent(4);
					infoPanel.setBackground(Colors.LTBackground);
					infoPanel.getComponent(1).setForeground(Color.BLACK);
					infoPanel.getComponent(2).setForeground(Colors.LTBlue);
					infoPanel.getComponent(3).setForeground(Colors.LTBlue);
					infoPanel.getComponent(4).setForeground(Colors.LTBlue);
					infoPanel.getComponent(5).setForeground(Colors.LTBlue);
					infoPanel.getComponent(6).setForeground(Colors.LTBlue);
					infoPanel.getComponent(7).setForeground(Color.BLACK);
					infoPanel.getComponent(8).setForeground(Color.BLACK);
					infoPanel.getComponent(9).setForeground(Color.BLACK);
					infoPanel.getComponent(10).setForeground(Color.BLACK);
					Heading infoPanelHeading = (Heading) infoPanel.getComponent(11);
					infoPanelHeading.label.setForeground(Color.BLACK);
					infoPanelHeading.line.setBackground(Colors.LTBlue);
					
					this.getComponent(5).setBackground(Colors.LTBackground); //searchbar foreground?
				}
		}
	}
	
	public void Login(boolean dark, String Parent) {
		if (dark == true) {
			if (Parent == "Login") {
				//DARK THEME
				this.setBackground(Colors.DTBackground);
				Textfield username = (Textfield) this.getComponent(0);
				username.handleFocus(true, username.type, username.name);
				PasswordField password = (PasswordField) this.getComponent(1);
				password.handleFocus(true, password.name);
				this.getComponent(2).setBackground(Colors.DTPurple);
				this.getComponent(3).setForeground(Colors.DTPurple); 
				this.getComponent(6).setForeground(Colors.DTInactive);
				this.getComponent(7).setForeground(Colors.DTInactive);
				this.getComponent(8).setForeground(Colors.DTPurple);
			}
		} else {
			if (Parent == "Login") {
				//LIGHT THEME
				this.setBackground(Colors.LTBackground);
				Textfield username = (Textfield) this.getComponent(0);
				username.handleFocus(false, username.type, username.name);
				PasswordField password = (PasswordField) this.getComponent(1);
				password.handleFocus(false, password.name);
				this.getComponent(2).setBackground(Colors.LTBlue);
				this.getComponent(3).setForeground(Colors.LTBlue);
				this.getComponent(6).setForeground(Colors.LTGray);
				this.getComponent(7).setForeground(Colors.LTGray);
				this.getComponent(8).setForeground(Colors.LTBlue);
			}
		}
	}
	
	public void Register(boolean dark, String Parent) {
		if (dark == true) {
			if (Parent == "Register") {
				//DARK THEME
				this.setBackground(Colors.DTBackground);
				Textfield nickname = (Textfield) this.getComponent(2);
				nickname.handleFocus(true, nickname.type, nickname.name);
				Textfield fullname = (Textfield) this.getComponent(3);
				fullname.handleFocus(true, fullname.type, fullname.name);
				Textfield email = (Textfield) this.getComponent(4);
				email.handleFocus(true, email.type, email.name);
				PasswordField password = (PasswordField) this.getComponent(5);
				password.handleFocus(true, password.name);
				PasswordField rpassword = (PasswordField) this.getComponent(6);
				rpassword.handleFocus(true, rpassword.name);
				this.getComponent(9).setBackground(Colors.DTPurple);
			}
		} else {
			if (Parent == "Register") {
				//LIGHT THEME
				this.setBackground(Colors.LTBackground);
				Textfield nickname = (Textfield) this.getComponent(2);
				nickname.handleFocus(false, nickname.type, nickname.name);
				Textfield fullname = (Textfield) this.getComponent(3);
				fullname.handleFocus(false, fullname.type, fullname.name);
				Textfield email = (Textfield) this.getComponent(4);
				email.handleFocus(false, email.type, email.name);
				PasswordField password = (PasswordField) this.getComponent(5);
				password.handleFocus(false, password.name);
				PasswordField rpassword = (PasswordField) this.getComponent(6);
				rpassword.handleFocus(false, rpassword.name);
				this.getComponent(9).setBackground(Colors.LTBlue);
			}
		}
	}
	
	public void setDarkTheme(JFrame frame, boolean dark) {
		String Parent = frame.getClass().getName();
		Login(dark, Parent);
		Register(dark, Parent);
		MainWindow(dark,Parent);
		Add_add(dark, Parent);
	}
	public Theme() {
		//nothing
	}
}
