/**
 * @(#)EMconverter.java
 *
 *
 * @author
 * @version 1.00 2011/5/25
 */


public class backtranslitrator
{
	String englishCopy;
	String malayalam;
	int cli;Boolean nsvu,igChar,spcase;char current_character;
    public backtranslitrator()
    {


    }
    public String TrOpMalayalam(String english)
    {	System.out.println(english);
    	english="|"+english;
    	int length=english.length();
		String temp;
		malayalam="";

    	english=english+"          ";
    	englishCopy=english;

    	cli=1;
		while(cli<length)
		{	igChar=false;nsvu=true;spcase=false;
			current_character=english.charAt(cli);

			if(current_character!=character(right(cli))&&isVowel(cli)&&isVowel(right(cli)))
			{
				if(vowel2(cli)&&vowel1(right(cli))&&!isLetter(left(cli)))
				igChar=true;
			}
			if(!igChar)
			{
				temp=characterEqv(current_character);
				if(spcase)
					malayalam=malayalam.substring(0,malayalam.length()-1);
				malayalam=malayalam+temp;

			}
			if(reqVirama())
				malayalam=malayalam+"\u0d4d";	//MALAYALAM SIGN VIRAMA	?
			if(current_character!=character(right(cli))&&isVowel(cli)&&isVowel(right(cli)))
			{
				malayalam=malayalam+"\u0d2f";
			}
			cli++;
		}

    	return malayalam;

    }
    Boolean reqVirama()
    {

    		if(isLetter(cli)&&!(isVowel(right(cli))||isVowel(cli))&&nsvu)
    		return true;
    		return false;
    }
	int left(int i)
	{
		return (i-1);
	}
	int right(int i)
	{
		return (i+1);
	}

	Boolean isVowel(int i)
	{
		char c=englishCopy.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			return true;
		return false;


	}
	Boolean vowelStart(int i)
	{
		char c=englishCopy.charAt(i);

		if(c=='c'||c=='f'||c=='l'||c=='m'||c=='r'||c=='n'||c=='s'||c=='v'||c=='x'||c=='z'||c=='L')
			return true;

			return false;
	}
	boolean vowel1(int i)
	{
		char c=englishCopy.charAt(i);
		if(c=='a'||c=='o'||c=='u'||c=='A'||c=='O'||c=='U')
			return true;
		return false;

	}
	boolean vowel2(int i)
	{
		char c=englishCopy.charAt(i);
		if(c=='e'||c=='i'||c=='E'||c=='I')
			return true;
		return true;


	}

	Boolean isLetter(int i)
	{
		char c=englishCopy.charAt(i);
		if(c>64&&c<123)
			return true;
		else
			return false;
	}
	char character(int i)
	{
		return englishCopy.charAt(i);

	}
	 public String characterEqv(char c)
	{

		switch(c)
			{
				case 'a':

					if(!isLetter(left(cli)))
					{
						if(character(right(cli))=='a')
						{	cli++;
							return "\u0D06";	//MALAYALAM character AA

						}
						else
							return "\u0d05";
					}
					else
					{
						if(character(right(cli))=='a')
						{cli++;	return "\u0d3e";	//MALAYALAM VOWEL SIGN AA	?
						}
						else if(character(right(cli))=='i')
						{cli++;	return "\u0d48";	//MALAYALAM VOWEL SIGN AA	?
						}
						return "";

					}


				case 'b':
					if(character(right(cli))=='h')
					{
						cli++;	return "\u0d2d";	//MALAYALAM character BHA	?
					}
					else
						return "\u0d2c"; //MALAYALAM character BA	?

				case 'c':
					if(character(right(cli))=='h')
					{
						cli++;
						return "\u0d1a";	//MALAYALAM character CA	?
					}
					else if(character(right(cli))=='H')
					{
						cli++;
						return "\u0d1a\u0d4d\u0d1a";	//MALAYALAM character CA	?//MALAYALAM SIGN VIRAMA	?
					}
					if(character(right(cli))=='e'||character(right(cli))=='i'||character(right(cli))=='E')
						return "\u0d38";	//MALAYALAM character SA	?
					else if(character(right(cli))=='k')
					{cli++;
						return "\u0d15";	//MALAYALAM character KA	?
					}
					else if(character(right(cli))=='a'||character(right(cli))=='A'||character(right(cli))=='u')
					{
						if(vowelStart(right(right(cli)))||isVowel(right(right(cli))))
							return "\u0d15";
						else
							return "\u0d15\u0d4d\u0d2f";//MALAYALAM character YA	?//MALAYALAM SIGN VIRAMA	?
					}
					else return "\u0d15";

				case 'd':
					if(character(right(cli))=='h')
					{cli++;	return "\u0d27";
					}
					else
						return "\u0d21";	//MALAYALAM character DDA	?
				case 'e':
					if(!isLetter(right(cli))&&!isVowel(left(cli-1))&&vowelStart(left(cli)))
						return "\u0d4d";
					if(!isLetter(left(cli)))
					{
						if(character(left(cli))=='e')
							return "\u0d08";	//MALAYALAM character II
						else
							return "\u0d07";
					}
					else if(character(right(cli))=='e')
					{	cli++;	return "\u0d40";	//MALAYALAM VOWEL SIGN II	?
					}
					else if(!isVowel(left(cli)))
					{
						if(isVowel(left(left(cli)))||isVowel(right(cli)))
							return "\u0d4d";
					}
						return "\u0d46";	//MALAYALAM VOWEL SIGN E	?
				case 'f':
					return "\u0d2b";	//MALAYALAM character PHA	?
				case 'g':
					if(character(right(cli))=='h')
					{
						cli++;
						return "\u0d18";	//MALAYALAM character GHA	?
					}
					else
						return "\u0d17";	//MALAYALAM character GA	?
				case 'h':
				//	if(!isLetter(left(cli))&&character(right(cli))=='r')
					{
				//		nsvu=false;cli++;
				//		return "\u0d0b";	//MALAYALAM character VOCALIC R	?
					}
					return "\u0d39";	//MALAYALAM character HA	?
				case 'i':
			 if(!isLetter(left(cli)))
						return "\u0d07";	//MALAYALAM character I
					else
						return "\u0d3f";	//MALAYALAM VOWEL SIGN I	?
				case 'j':
					if(character(right(cli))=='h')
					{cli++;	return "\u0d1d";	//MALAYALAM character JHA	?
					}
					else
						return "\u0d1c";	//MALAYALAM character JA	?
				case 'k':
					if(character(right(cli))=='h')
					{cli++;	return "\u0d16";	//MALAYALAM character KHA	?
					}
					else
						return "\u0d15";	//MALAYALAM character KA	?
				case 'l':
					if(!isVowel((right(cli)))&&!(character((right(cli)))=='y'||character((right(cli)))=='l'))
					{	nsvu=false;
						return "\u0d7d";
					}
					return "\u0d32";	//MALAYALAM character LA	?
				case 'm':

					if(isVowel(left(cli))&&!isVowel(right(cli)))
					{	if(character(right(cli))=='m'||character(right(cli))=='p')
							return "\u0d2e";	//MALAYALAM character MA	?

						else
						{
							nsvu=false;
							return "\u0d02";
						}
					}


						return "\u0d2e";	//MALAYALAM character MA	?
				case 'n':
						if(character(right(cli))=='j')
						{
							cli++;
							return "\u0d1e";	//MALAYALAM character NYA	?
						}
						else if(character(right(cli))=='g')
						{
							cli++;
							return "\u0D19";	//MALAYALAM character NGA	?
						}
						else if(character(right(cli))=='J')
						{
							cli++;
							return "\u0d1e\u0d4d\u0d1e";	//MALAYALAM character NGA	?
						}
						else if(character(right(cli))=='G')
						{
							cli++;
							return "\u0D19\u0d4d\u0D19";	//MALAYALAM character NGA	???
						}
						else if(!isVowel(right(cli))&&!(character(right(cli))=='D'||character(right(cli))=='k'||character(right(cli))=='n'||character(right(cli))=='y'||character(right(cli))=='r'||(character(right(cli))=='t'&&character(right(right(cli)))=='h')))
						{
							nsvu=false;
							return "\u0D6F";	//MALAYALAM DIGIT NINE	?
						}

							return "\u0d28";	//MALAYALAM character NA	?

				case 'o':
					if(!isLetter(left(cli)))
					{
						if(character(right(cli))=='o')
						{	cli++;
							return "\u0d0a";	//MALAYALAM character UU	?
						}
						if(character(right(cli))=='u'||character(right(cli))=='w')
						{	cli++;nsvu=false;
							return "\u0d14";	//MALAYALAM character UU	?
						}
						else
							return "\u0d12";
					}
					else
					{
						if(character(right(cli))=='o')
						{	cli++;
							return "\u0D42";	//MALAYALAM VOWEL SIGN UU	?
						}
						if(character(right(cli))=='u')
						{	cli++;
							return "\u0D4C";	//MALAYALAM VOWEL SIGN AU	?
						}
						else if(character(right(cli))=='w')
						{	cli++;nsvu=false;
							return "\u0D4c";	//MALAYALAM AU LENGTH MARK	?
						}
						else
							return "\u0D4A";	//MALAYALAM VOWEL SIGN O	?
					}

				case 'p':
					if(character(right(cli))=='h')
					{cli++;	return "\u0d2b";	//MALAYALAM character PHA	?
					}
					else
						return "\u0d2a";	//MALAYALAM character PA	?
				case 'q':
					return "\u0d15\u0d4d\u0d2f";	//MALAYALAM character KA	?//MALAYALAM SIGN VIRAMA	?
				case 'r':
					if(!isVowel(right(cli)))
					{
						if(character(right(cli))=='y')
						{
							if(isVowel(right(right(cli))))
								return "\u0d30";
						}
						else if(isLetter(left(cli)))
						{	nsvu=false;
							return "\u0d6a";
						}

					}
					return "\u0d30";
				case 's':
					if(character(right(cli))=='h')
					{
						cli++;  return "\u0d37";	//MALAYALAM character SSA	?
					}
					return "\u0d38";	//MALAYALAM character SA	?
				case 't':
					if(isVowel(right(cli+1))&&character(right(cli))=='i')
					{
							cli++;
							return "\u0d37\u0d4d\u0d2f";	//MALAYALAM character YA	?//MALAYALAM SIGN VIRAMA	?
					}
					else if(character(right(cli))=='h')
					{cli++;	return "\u0d24";	//MALAYALAM character TA	?
					}
					else if(character(right(cli))=='H')
					{cli++;	return "\u0d24\u0d4d\u0d24";	//MALAYALAM character TA	???
					}
					else
						return "\u0d31\u0d4d\u0d31";	//MALAYALAM character TTA	?
				case 'u':
					if(!isLetter(left(cli)))
					{
						return "\u0d09";	//MALAYALAM character U
					}
					else
						return "\u0d41";	//MALAYALAM VOWEL SIGN U	?
				case 'v':
					return "\u0d35";	//MALAYALAM character VA	?
				case 'w':

					if(character(right(cli))=='h')
						cli++;
					return "\u0d35";	//MALAYALAM character VA	?
				case 'x':
					return "\u0d15\u0d4d\u0d38";	//MALAYALAM character KA	?//MALAYALAM SIGN VIRAMA	?//MALAYALAM character SA	?
				case 'y':
					if(!isVowel(left(cli)))
					{
						if(isVowel(right(cli)))
							return "\u0d2f";
						else
						{
							if(lastChar()=='\u0d4d')
								spcase=true;
							nsvu=false;
							return "\u0d48";
						}
					}
					else
					{
						return "\u0d2f";
					}

				case 'z':
					if(character(right(cli))=='h')
					{	cli++;
						return "\u0d34";	//MALAYALAM character LLLA	?
					}
					else
						return "\u0d38";	//MALAYALAM character SA	?
				case 'A':
					if(!isLetter(left(cli)))
						return "\u0d06";
					else
						return "\u0d3e";
				case 'D':

					if(character(right(cli))=='h')
					{
						cli++;
						return "\u0D20";	//MALAYALAM character TTHA	?
					}
					else if(character(right(cli))=='H')
					{
						cli++;
						return "\u0D22";	//MALAYALAM character TTHA	?
					}
					return "\u0d26";	//MALAYALAM character DA	?
				case 'E':
					if(!isLetter(left(cli)))
					{	if(character(right(cli))=='E')
						{cli++;	return "\u0d0f";		//MALAYALAM character E	?
						}
						return "\u0d0e";	//MALAYALAM character EE	?
					}
					else if(character(right(cli))=='E')
					{
						cli++;
						return "\u0D47";	//MALAYALAM VOWEL SIGN EE	?
					}
					else
						return "\u0D47";
				case 'I':
					if(!isLetter(left(cli)))
					return "\u0d10";	//MALAYALAM character AI	?
				case 'N':
					if(!isVowel((right(cli)))&&!(character((right(cli)))=='y'||character((right(cli)))=='t'))
					{	nsvu=false;
						return "\u0d7a";
					}
					return "\u0d23";	//MALAYALAM character NNA	?
				case 'O':
					if(!isLetter(left(cli)))
					{
						if(character(right(cli))=='o'||character(right(cli))=='O')
						{	cli++;
							return "\u0D13";	//MALAYALAM character OO	?
						}

					}

					else
						return "\u0D4B";	//MALAYALAM VOWEL SIGN OO	?

				case 'S':

					return "\u0d36";	//MALAYALAM character SHA	?
				case 'R':
					if(isLetter(left(cli))&&!isVowel(right(cli)))
					{	nsvu=false;
						return "\u0d6a";	//MALAYALAM DIGIT FOUR	?
					}
					else
						return "\u0d31";	//MALAYALAM character RRA	?
				case 'T':
					if(character(right(cli))=='h')
					{cli++;	return "\u0d25";	//MALAYALAM character THA	?
					}
					else if(character(right(cli))=='H')
					{cli++;	return "\u0d27";	//MALAYALAM character DHA	?
					}
					else if(character(right(cli))=='y')
					{
						cli++;nsvu=false;
						return "\u0d31\u0d48\u0d31";	//MALAYALAM VOWEL SIGN AI	?
					}
					else
						return "\u0d1f";	//MALAYALAM SIGN VIRAMA	?
				case 'G':

				case 'L':
					if(!isVowel((right(cli)))&&!(character((right(cli)))=='y'||character((right(cli)))=='l'))
					{	nsvu=false;
						return "\u0d7e";
					}
					return "\u0d33";	//MALAYALAM character LLA	?
				case 'C':
					if(character(right(cli))=='h')
					{	cli++;
						return "\u0D1B";	//MALAYALAM character CHA	?
					}
				case '|':
					return "";
				default:
					return englishCopy.substring(cli,cli+1);
			}

	}
char lastChar()
			{
				return(malayalam.charAt(malayalam.length()-1));
			}

}