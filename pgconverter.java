class pgconverter
{
	public pgconverter()
	{

	}
	public String pgconvert(String ep)
	{
		int cli;
		String mstring="";
		cli=0;
		while(cli<ep.length())
		{
			mstring+=mgeqv(ep.substring(cli,cli+2));
			cli+=2;
		}
		return "";
	}
	String mgeqv(String phon)
	{
		if(phon.equals(""))
			return "";
			return "";
	}
}