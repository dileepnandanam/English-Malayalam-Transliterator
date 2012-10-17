/**
 * @(#)EMtransliterator.java
 *
 * EMtransliterator application
 *
 * @author
 * @version 1.00 2011/7/16
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class trinterface extends JFrame implements ActionListener
{


	trsystem convert=new trsystem();
	JTextField jtAreaInputlabel,jtAreaOutputlabel;
	JTextArea jtAreaOutput;
	JTextArea jtAreaInput;
	Button convertbuttonf;
	Button convertbuttonb;
	String newline = "\n";
	public trinterface()
	{
		createGui();

	}


 	public void createGui()
	{


		Font font = new Font("kartika", Font.PLAIN, 20);
		JFrame frame=new JFrame("English-Malayalam Transliterator");

		jtAreaInput = new JTextArea("",5,40);jtAreaInput.setEditable(true);
		jtAreaOutput = new JTextArea("",5,40);jtAreaOutput.setEditable(true);
		jtAreaOutput.setFont(font);
		jtAreaInput.setFont(font);

		JScrollPane scrollPaneEng = new JScrollPane(jtAreaInput,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		JScrollPane scrollPaneMal = new JScrollPane(jtAreaOutput,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);



		convertbuttonf=new Button("Translitrate Forward");
		convertbuttonf.addActionListener(this);
		convertbuttonb=new Button("Translitrate backward");
		convertbuttonb.addActionListener(this);
		JTextField elab,mlab;
		elab=new JTextField("english:",0);
		mlab=new JTextField("malayalam:",0);
		Container english=getContentPane();







		GridBagLayout gridBag = new GridBagLayout();
		english.setLayout(gridBag);


		GridBagConstraints gridCons1 = new GridBagConstraints();


		gridCons1.gridwidth = GridBagConstraints.REMAINDER;
		gridCons1.fill = GridBagConstraints.HORIZONTAL;
		english.add(elab,gridCons1);elab.setEditable(false);

		gridCons1.gridwidth = GridBagConstraints.REMAINDER;
		gridCons1.fill = GridBagConstraints.HORIZONTAL;
		english.add(scrollPaneEng,gridCons1);



		gridCons1.gridwidth = GridBagConstraints.REMAINDER;
		gridCons1.fill = GridBagConstraints.VERTICAL;
		english.add(convertbuttonf,gridCons1);
		english.add(convertbuttonb,gridCons1);




		gridCons1.gridwidth = GridBagConstraints.REMAINDER;
		gridCons1.fill = GridBagConstraints.HORIZONTAL;
		english.add(mlab,gridCons1);mlab.setEditable(false);


		gridCons1.gridwidth = GridBagConstraints.REMAINDER;
		gridCons1.fill = GridBagConstraints.HORIZONTAL;
		english.add(scrollPaneMal,gridCons1);

		frame.add(english);









		frame.pack();
		frame.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e){System.exit(0);}});
		frame.setVisible(true);

	}

	public void actionPerformed(ActionEvent evt)
	{	String uni="";
		String text = jtAreaInput.getText();
		if(evt.getSource()==convertbuttonb)
			uni=convert.uniconv(text,true);
		if(evt.getSource()==convertbuttonf)
			uni=convert.uniconv(text,false);

		jtAreaOutput.replaceRange(uni,0,(jtAreaOutput.getText()).length());
		jtAreaInput.selectAll();


	}

}
public class EMtransliterator
{

public static void main(String[] args)
	{
		trinterface trinterface = new trinterface();


	}




}


class trsystem
{
	dtree dm;
	backtranslitrator bc;
	phoneticdict pm;
	public trsystem()
	{
		dm=new dtree();
		pm=new phoneticdict();
		bc=new backtranslitrator();
	}
	public String uniconv(String text,Boolean mod)
	{	char c;
		String mstring="";text+=" ";
		int i;
		int ws=0,we=0;
		Boolean in=false;
		for(i=0;i<text.length();i++)
		{
			c=text.charAt(i);
			if(isletr(c))
			{	if(!in)
					ws=i;
				in=true;
			}
			else
			{	if(in)
					mstring+=convert(text.substring(ws,i),mod);

				mstring+=text.substring(i,i+1);

				in=false;

			}

		}

		return mstring;
	}
	Boolean isletr(char c)
	{	int i;
		String alpha="qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		for(i=0;i<alpha.length();i++)
		{
			if(alpha.charAt(i)==c)
				return true;
		}
		return false;
	}
	public String convert(String estring,Boolean mod)
	{
		String result="";
		if(mod)
		{
			result=bc.TrOpMalayalam(estring);
		}
		else
		{
			result=pm.gr(pm.phoneticeqv(estring.toLowerCase()));
			if(result.equals(""))
			{
				result=dm.uniconv(estring.toLowerCase());
			}
		}
		return result;
	}
}
