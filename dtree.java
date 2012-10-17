/**
 * @(#)dtree.java
 *
 * directmapping application
 *
 * @author
 * @version 1.00 2011/7/11
 */

public class dtree
{
	public static nod head;
	dtree()
	{
		head=new nod("3( )");
		creatpath("3( ){ }1");
//paths for Vowels:
//paths for 'a':
creatpath("3(a)2( )4(a){\u0d06}2");
creatpath("3(a)2( )4(e){\u0d0f}2");
creatpath("3(a)2( )4(u){\u0d14}2");
creatpath("3(a)2( )4(i){\u0d10}2");
creatpath("3(a)2( )4(o){\u0d13}2");
creatpath("3(a)2( )4(w){\u0d14}2");
/*
creatpath("3(a)2( )!4(aeiou)5(e){\u0d0f}1");
creatpath("3(a)2( )!4(aeiou)!4(mns){\u0d05}1");
creatpath("3(a)2( )!4(aeiou)4(mns){\u0d06}1");
*/
creatpath("3(a)2( )4(xfhlmns)5(tbcdgjkpq){\u0d06}1");
creatpath("3(a)2( )4(xfhlmns)5(xfhlmns){\u0d05}1");
creatpath("3(a)2( )4(xfhlmns)5(aeiouy){\u0d0e}1");
creatpath("3(a)2( )4(xfhlmns)!5(aeiouy){\u0d06}1");
creatpath("3(a)2( )4(tbcdgjkpq)5(xfhlmns){\u0d05}1");
creatpath("3(a)2( )4(tbcdgjkpq)5(tbcdgjkpq){\u0d06}1");
creatpath("3(a)2( )4(tbcdgjkpq)5(aeiouy){\u0d05}1");
creatpath("3(a)2( )4(tbcdgjkpq)!5(aeiouy){\u0d05}1");
creatpath("3(a)2( )!4(tbcdgjkpq){\u0d0f}1");


creatpath("3(a)!2( )4(a){\u0d3e}2");
creatpath("3(a)!2( )4(e){\u0d47}2");
creatpath("3(a)!2( )4(u){\u0d57}2");
creatpath("3(a)!2( )4(i){\u0d46\u0d2f\u0d4d}2");
creatpath("3(a)!2( )4(o){\u0d4b}2");
creatpath("3(a)!2( )4(w){\u0d57}2");
//creatpath("3(a)!2( )!4(aeiou)5(e){\u0d47}1");
creatpath("3(a)!2( )4(rxfhlmns)5(tbcdgjkpq){\u0d3e}1");
creatpath("3(a)!2( )4(rxfhlmns)5(rxfhlmns){\u0d3e}1");
creatpath("3(a)!2( )4(rxfhlmns)5(aeiouy){\u0d46}1");
creatpath("3(a)!2( )4(rxfhlmns)!5(aeiouy){\u0d3e}1");
creatpath("3(a)!2( )4(tbcdgjkpq)5(rxfhlmns){\u0d46}1");
creatpath("3(a)!2( )4(tbcdgjkpq)5(aeiouy){\u0d47}1");
creatpath("3(a)!2( )4(tbcdgjkpq)!5(aeiouy){\u0d3e}1");
creatpath("3(a)!2( )4(ryz){\u0d47}1");
creatpath("3(a)!2( )!4(ryz){~}1");


//paths for 'b':
creatpath("3(b)4(h){\u0d2d\u0d4d}2");
creatpath("3(b)!4(h){\u0d2c\u0d4d}1");

//paths for 'e':

creatpath("3(e)2( )4(a)5(fr){\u0d0f}2");
creatpath("3(e)2( )4(a)!5(fr){\u0d08}2");
creatpath("3(e)2( )4(e){\u0d08}2");
creatpath("3(e)2( )4(u){\u0d2f\u0d42}2");
creatpath("3(e)2( )4(i){\u0d10}2");
creatpath("3(e)2( )4(o){\u0d07\u0d2f\u0d4b}2");
creatpath("3(e)2( )4(w){\u0d2f\u0d42}2");

creatpath("3(e)2( )4(rxfhlmns)5(tbcdgjkpq){\u0d0e}1");
creatpath("3(e)2( )4(rxfhlmns)5(rxfhlmns){\u0d0e}1");
creatpath("3(e)2( )4(rxfhlmns)5(aeiou){\u0d0e}1");
creatpath("3(e)2( )4(rxfhlmns)!5(aeiou){\u0d0e}1");
creatpath("3(e)2( )4(tbcdgjkpq)5(rxfhlmns){\u0d07}1");
creatpath("3(e)2( )4(tbcdgjkpq)5(tbcdgjkpq){\u0d0e}1");
creatpath("3(e)2( )4(tbcdgjkpq)5(aeiou){\u0d0e}1");
creatpath("3(e)2( )4(tbcdgjkpq)!5(aeiou){\u0d0e}1");
creatpath("3(e)2( )!4(tbcdgjkpq)!5(aeiou){\u0d0e}1");
creatpath("3(e)2( )!4(tbcdgjkpq)5(aeiou){\u0d0e}1");

//creatpath("3(e)1( )4( ){\u0d3f}1");

creatpath("3(e)!2( )4(e){\u0d40}2");
creatpath("3(e)!2( )4( )1( ){\u0d3f}1");
creatpath("3(e)!2( )4( )!1( ){}1");

creatpath("3(e)!2( )4(a)5(r){\u0d3f\u0d2f}2");
creatpath("3(e)!2( )4(a)5(t)2(vr){\u0d3f\u0d2f}1");
creatpath("3(e)!2( )4(a)5(t)!2(vr){\u0d40}2");
creatpath("3(e)!2( )4(a)5(dbp){\u0d46}2");
creatpath("3(e)!2( )4(a)5(lmnt){\u0d40}2");
creatpath("3(e)!2( )4(a)!5(lmnt){\u0d40}2");
creatpath("3(e)!2( )4(u){\u0d2f\u0d42}2");
creatpath("3(e)!2( )4(i){\u0d2f\u0d4d}2");
creatpath("3(e)!2( )4(o){\u0d2f\u0d4b}2");
creatpath("3(e)!2( )4(w){\u0d2f\u0d42}2");

/*
creatpath("3(e)!2( )!2(aeiou)!4(aeiou ){\u0d46}1");
creatpath("3(e)!2( )!2(aeiou)!1(aou)4( ){}1");
creatpath("3(e)!2( )!2(aeiou)!1(aou)!4( ){\u0d46}1");
*/
creatpath("3(e)!2( )4(xfhlmns)5(aeiou){~}1");
creatpath("3(e)!2( )4(xfhlmns)5(tbcdgjkpq){\u0d46}1");
creatpath("3(e)!2( )4(xfhlmns)5(rxfhlmns){\u0d46}1");
//creatpath("3(e)!2( )4(rxfhlmns)5(aeiou){\u0d46}1");
//creatpath("3(e)!2( )4(rxfhlmns)!5(aeiou){\u0d46}1");
creatpath("3(e)!2( )4(xfhlmns)!5(aeiou){}1");

creatpath("3(e)!2( )4(tbcdgjkpq)5(fhlmns){\u0d46}1");
creatpath("3(e)!2( )4(tbcdgjkpq)5(aeiou){\u0d46}1");
creatpath("3(e)!2( )4(tbcdgjkpq)!5(aeiou){\u0d46}1");
creatpath("3(e)!2( )!4(tbcdgjkpq)!2(aeiou)!4(aeiou ){\u0d46}1");
creatpath("3(e)!2( )!4(tbcdgjkpq)!2(aeiou)!1(aou)4( ){}1");
creatpath("3(e)!2( )!4(tbcdgjkpq)!2(aeiou)!1(aou)!4( ){\u0d46}1");
creatpath("3(e)!2( )!4(tbcdgjkpq)!2(aeiou)1(aou){}1");

creatpath("3(e)!2( )!5(aeiou)5(e){\u0d46}1");
creatpath("3(e)!2( )!5(aeiou)!5(e){}1");

//paths for 'i':
creatpath("3(i)2( )4(aeou){\u0d07\u0d2f}1");
creatpath("3(i)2( )!4(aeiou){\u0d07}1");

creatpath("3(i)!2( )4(eiou){\u0d3f\u0d2f}1");
creatpath("3(i)!2( )4(ao){\u0d3f\u0d2f}2");

creatpath("3(i)!2( )!4(aeiou)!2(aeiou)4(fhlmnrs)5(aioufhlmnrs){\u0d3f}1");
creatpath("3(i)!2( )!4(aeiou)!2(aeiou)4(fhlmnrs)!5(aioufhlmnrs)5(e){\u0d48}1");
creatpath("3(i)!2( )!4(aeiou)!2(aeiou)4(fhlmnrs)!5(aioufhlmnrs)!5(e){\u0d3f}1");
creatpath("3(i)!2( )!4(aeiou)!2(aeiou)!4(fhlmnrs)5(aeiufhlmnrs){\u0d48}1");
creatpath("3(i)!2( )!4(aeiou)!2(aeiou)!4(fhlmnrs)!5(o){\u0d48}1");
creatpath("3(i)!2( )!4(aeiou)!2(aeiou)!4(fhlmnrs)5(o){\u0d3f}1");

//paths for 'o':
creatpath("3(o)2( )4(u){\u0d14}2");
creatpath("3(o)2( )4(o){\u0d0a}2");
creatpath("3(o)2( )4(w){\u0d14}2");
creatpath("3(o)2( )4(a){\u0d12\u0d2f}2");
creatpath("3(o)2( )4(i){\u0d12\u0d2f\u0d3f}2");
creatpath("3(o)2( )4(bcdgjklpqrt)!5(aeiouy){\u0d12}1");
creatpath("3(o)2( )4(bcdgjklpqrt)5(aeiouy){\u0d13}1");
creatpath("3(o)2( )!4(bcdgjklpqrt){\u0d13}1");

creatpath("3(o)!2( )4(o){\u0d42}2");
creatpath("3(o)!2( )4(u)!2(y){\u0d57}2");

creatpath("3(o)!2( )4(w){\u0d4c}2");
creatpath("3(o)!2( )4(a){\u0d4b}2");
creatpath("3(o)!2( )4(i){\u0d4a\u0d2f\u0d3f}2");

creatpath("3(o)!2( )4(bcdgjklpqrt)!5(aeiouy){\u0d4a}1");
creatpath("3(o)!2( )4(bcdgjklpqrt)5(aeiouy){\u0d4b}1");

creatpath("3(o)!2( )!4(bcdgjklpqrt)8(eifhl){}1");
creatpath("3(o)!2( )!4(bcdgjklpqrt)!8(eifhl){\u0d4b}1");


//paths for 'u':

creatpath("3(u)2( )!4(aeiou)!5(i){\u0d05}1");
creatpath("3(u)2( )!4(aeiou)5(i){\u0d2f\u0d41}1");


creatpath("3(u)!2( )2(aeiou)4(ae){~\u0d41}2");


creatpath("3(u)!2( )!2(aeiou)4(ae)5(aeiou){}2");
creatpath("3(u)!2( )!2(aeiou)4(ae)!5(aeiou){\u0d35\u0d46}2");
creatpath("3(u)!2( )!2(aeiou)4(o){\u0d35\u0d4a}2");
creatpath("3(u)!2( )!2(aeiou)4(i)5( ){\u0d41\u0d2f\u0d3f}2");
creatpath("3(u)!2( )!2(aeiou)4(i)!5( ){\u0d35\u0d3f}2");

//creatpath("3(u)!2( )!4(aeiou)2(bcdgjkptvz)4(bcdgjkptvz)5(aeiou){\u0d2f\u0d41}
creatpath("3(u)!2( )!2(aeiou)!4(aeiou)5(aeiou){\u0d2f\u0d41}1");
creatpath("3(u)!2( )!2(aeiou)!4(aeiou)!5(aeiou){~}1");

//creatpath("3(u)!2( )4(i){\u0d2f\u0d3f}2");

//paths for 'b':
creatpath("3(b)4(h){\u0d2d\u0d4d}2");
creatpath("3(b)!4(h){\u0d2c\u0d4d}1");

//paths for 'c':

//creatpath("3(c)2(y)4(h)5(o)(\u0d15\u0d4d\u0d15\u0d4d}3");
creatpath("3(c)4(h){\u0d1a\u0d4d}2");
creatpath("3(c)4(k){\u0d15\u0d4d}2");
creatpath("3(c)4(c)5(aei){\u0d15\u0d4d\u0d38\u0d4d}2");
creatpath("3(c)4(c)5(ou){\u0d15\u0d4d\u0d15\u0d4d}2");
creatpath("3(c)4(eiy){\u0d38\u0d4d}1");
creatpath("3(c)!4(eiy){\u0d15\u0d4d}1");

//paths for 'd':
creatpath("3(d)4(h){\u0d27}2");
creatpath("3(d)!4(h){\u0d21\u0d4d}1");

//paths for 'f':
creatpath("3(f){\u0d2b\u0d4d}1");

//paths for 'g':
creatpath("3(g)4(g){\u0d17\u0d4d\u0d17\u0d4d}2");
creatpath("3(g)4(h){}2");

creatpath("3(g)!2(aeiou)!4(aeiou){\u0d17\u0d4d}1");
creatpath("3(g)2(aeiou)4(aeiou){\u0d1c\u0d4d}1");
creatpath("3(g)2(aeiou)!4(aeiou){\u0d17\u0d4d}1");
creatpath("3(g)!2(aeiou)4(aeiou){\u0d17\u0d4d}1");


//paths for 'h':
creatpath("3(h){\u0d39\u0d4d}1");

//paths for 'j':
creatpath("3(j){\u0d1c\u0d4d}1");

//paths for 'k':
creatpath("3(k)4(n)2( ){}1");
creatpath("3(k)!4(n){\u0d15\u0d4d}1");

//paths for 'l':


creatpath("3(l)4(l)!5(aeiou){\u0d7d}2");

creatpath("3(l)4(l)5(aeiou){\u0d32\u0d4d\u0d32\u0d4d}2");
creatpath("3(l)2(aeiou)4(aiou){\u0d32\u0d4d}1");
creatpath("3(l)2(aeiou)4( e)5( ){\u0d7d}1");
creatpath("3(l)2(aeiou)4( e)!5( ){\u0d32\u0d4d}1");
creatpath("3(l)2(aeiou)!4(aiouy){\u0d7d}1");
creatpath("3(l)2(aeiou)4(aiouy){\u0d32\u0d4d}1");
creatpath("3(l)4( e)2( ){\u0d32\u0d4d}1");
creatpath("3(l)4( e)!2( )5( ){\u0d3f\u0d7e}1");
creatpath("3(l)4( e)!2( )!5( ){\u0d32\u0d4d}1");

creatpath("3(l)!4( e){\u0d32\u0d4d}1");

/*
creatpath("3(l)2(aeiou)4(e)!5( ){\u0d32\u0d4d}1");
creatpath("3(l)2(aeiou)4(e)5( ){\u0d7d}1");
creatpath("3(l)!2(aeiou)!4(e){\u0d32\u0d4d}1");
*/
//paths for 'm':

creatpath("3(m)2(aeiou)4(m){\u0d2e\u0d4d\u0d2e\u0d4d}2");
creatpath("3(m)2(aeiou)!4(aeiou){\u0d02}1");
creatpath("3(m)2(aeiou)4(aiou){\u0d2e\u0d4d}1");
creatpath("3(m)2(aeiou)4(e)5( ){\u0d02}1");
creatpath("3(m)2(aeiou)4(e)!5( ){\u0d2e\u0d4d}1");
creatpath("3(m)!2(aeiou){\u0d2e\u0d4d}1");

//paths for 'n':
creatpath("3(n)4(g)!5(aeioufhlmnrs){\u0d19\u0d4d}2");
creatpath("3(n)4(g)5(aeioufhlmnrs){\u0d6f}1");
creatpath("3(n)2(aeiou)!4(aeiouy){\u0d6f}1");
creatpath("3(n)2(aeiou)4(aiou){\u0d28\u0d4d}1");
creatpath("3(n)2(aeiou)4(y){\u0d28\u0d4d}1");
creatpath("3(n)2(aeiou)4(e)5( ){\u0d6f}1");
creatpath("3(n)2(aeiou)4(e)!5( ){\u0d28\u0d4d}1");
creatpath("3(n)!2(aeiou){\u0d28\u0d4d}1");

//paths for 'p':
//creatpath("3(p)2( )4(s){}1");
creatpath("3(p)4(h){\u0d2b\u0d4d}2");
creatpath("3(p)!4(h){\u0d2a\u0d4d}1");


//paths for 'q':
creatpath("3(q){\u0d15\u0d4d\u0d2f\u0d4d}1");

//paths for 'r':
creatpath("3(r)4(r){}1");

creatpath("3(r)2(aeiou)!4(aiouy){\u0d6a}1");
creatpath("3(r)2(aeiou)4(aeiouy){\u0d31\u0d4d}1");
creatpath("3(r)!2(aeiou){\u0d31\u0d4d}1");

//paths for 's':
creatpath("3(s)4(h){\u0d37\u0d4d}2");
creatpath("3(s)4(i)2(a){\u0d37\u0d4d}2");
creatpath("3(s)!4(h){\u0d38\u0d4d}1");

//paths for 't':
creatpath("3(t)4(h)2( ){\u0d26\u0d4d}2");
creatpath("3(t)4(h)!2( ){\u0d24\u0d4d}2");


creatpath("3(t)4(i)5(oaeu)6( ){\u0d37\u0d4d\u0d2f}2");
creatpath("3(t)4(i)5(oaeu)!6( ){\u0d37}3");
creatpath("3(t)4(i)!5(oaeu){\uu0d31\u0d4d\u0d31\u0d4d}1");

creatpath("3(t)!4(i)4(t){\u0d31\u0d4d\u0d31\u0d4d}2");
creatpath("3(t)!4(i)!4(t){\u0d31\u0d4d\u0d31\u0d4d}1");

//paths for 'v':
creatpath("3(v){\u0d35\u0d4d}1");

//paths for 'w':
creatpath("3(w)4(h){\u0d35\u0d4d}2");
creatpath("3(w)!4(h){\u0d35\u0d4d}1");

//paths for 'x':
creatpath("3(x){\u0d15\u0d4d\u0d38\u0d4d}1");

//paths for 'y':
creatpath("3(y)2( )4(ei){\u0d07}1");
creatpath("3(y)2( )4(o)5(u){\u0d2f\u0d41}3");

//creatpath("3(y)!2( )4( )1(aeiou)!2(aeiou){\u0d3f}1");
//creatpath("3(y)!2( )4( )!1(aeiou){\u0d48}1");

creatpath("3(y)!2( )2(aeiou){\u0d2f\u0d4d}1");
creatpath("3(y)!2( )!2(aeiou)4(aeiou){\u0d2f\u0d4d}1");
creatpath("3(y)!2( )!2(aeiou)!4(aeiou)!4( )2(bcdgptz){\u0d48}1");
creatpath("3(y)!2( )!2(aeiou)!4(aeiou)!4( )!2(bcdgptz){\u0d3f}1");
creatpath("3(y)!2( )!2(aeiou)!4(aeiou)4( )1( ){\u0d48}1");
creatpath("3(y)!2( )!2(aeiou)!4(aeiou)4( )!1( ){\u0d3f}1");

//paths for 'z':
creatpath("3(z)4(h){\u0d34\u0d4d}2");
creatpath("3(z)!4(h){\u0d38\u0d4d}1");


	}
	String estring,mstring;
	int cli;
	void creatpath(String prule)
	{
		int i=0,nochk=0,chks,chkl,forward;
		String uni,chk[]=new String[10];
		char c;
		chks=0;chkl=0;
		while((c=prule.charAt(i))!='{')
		{
			chkl++;
			if(c==')')
			{
				chk[nochk++]=prule.substring(chks,chks+chkl);
				chks=i+1;
				chkl=0;

			}

			i++;

		}

		chks=i+1;
		chkl=-1;
		while(prule.charAt(i)!='}')
		{
			chkl++;
			i++;
		}
		uni=prule.substring(chks,chks+chkl);
		forward=(int)prule.charAt(i+1)-48;
		nod p=head;
		i=0;

		while(i<nochk)
		{
			if(p.chk.equals(chk[i]))
			{
				i++;
				if(p.yes==null)
				{
					p.yes=new nod(chk[i]);
				}
				p=p.yes;
			}
			else if(chk[i].charAt(0)=='!'&&chk[i].substring(1,chk[i].length()).equals(p.chk)||p.chk.charAt(0)=='!'&&p.chk.substring(1,p.chk.length()).equals(chk[i]))
			{	i++;

				if(p.no==null)
				{
					p.no=new nod(chk[i]);
				}
				p=p.no;
			}
			else
			{
				if(p.no==null)
				{
					p.no=new nod(chk[i]);
				}
				p=p.no;


			}
		}

		p.decision=true;
		p.mgrapheme=uni;
		p.forword=forward;
		p.decision=true;

	}
	public String uniconv(String eng)
	{	String cp;
		nod p;mstring="";
		estring="   "+eng+"         ";
		cli=3;
		while(cli<estring.length()-9)
		{	cp="";
			p=head;
			while(p!=null)
			{
				if(p.decision==true)
				{
					mstring+=p.mgrapheme;

					cli+=p.forword;
					cp=cp+"{"+p.mgrapheme+"}"+p.forword;
					break;
				}
				else
				{
					p.makedecision();

				}
				if(p.next==p.yes)
					cp+=p.chk;
				else
					cp+="!"+p.chk;
				p=p.next;
				if(p==null)
				{	System.out.println("no nod to map "+estring.charAt(cli-1)+estring.charAt(cli)+estring.charAt(cli+1));
					//System.out.println(cp+"2("+estring.charAt(cli-1)+")4("+estring.charAt(cli+1)+")");
					mstring+="["+estring.substring(cli,cli+1)+"]";
					cli++;
				}

			}


			System.out.println(cp);



		}
		int i;
		for(i=0;i<mstring.length();i++)
		{
			if(iscons(mstring.charAt(i))&&iscons(mstring.charAt(i-1)))
			{
				mstring=mstring.substring(0,i-1)+mstring.substring(i,mstring.length());
			}
			else if(mstring.charAt(i)=='~')
			{
				if(iscons(mstring.charAt(i-1)))
					mstring=mstring.substring(0,i-1)+mstring.substring(i+1,mstring.length());

			}
		}

		return mstring;
	}
	private boolean iscons(char c)
	{
		if(c=='\u0d4d'||c=='\u0d02'||c=='\u0d3e'||c=='\u0d3f'||c=='\u0d40'||c=='\u0d41'||c=='\u0d42'||c=='\u0d43'||c=='\u0d46'||c=='\u0d47'||c=='\u0d57'||c=='\u0d48'||c=='\u0d4a'||c=='\u0d4b'||c=='\u0d4c')
			return true;
		return false;
	}
	private class nod
	{	nod yes,no,next;
		nod(String nodrule)
		{
			chk=nodrule;
			decision=false;

		}
		String chk,mgrapheme;
		int forword;
		Boolean decision;

		void makedecision()
		{	Boolean chkpass=false,nigation;
			int i,ccli;
			i=0;
			char ccl;
			while(chk.charAt(i++)!='(');
			ccli=chk.charAt(i-2)-3-48;
			ccl=estring.charAt(cli+ccli);
			while(chk.charAt(i)!=')')
			{
				if(chk.charAt(i)=='!')
				{
					nigation=true;
					i++;
				}
				else
					nigation=false;

				if(nigation)
				{
					if(ccl!=chk.charAt(i))
					{
						chkpass=true;
						break;
					}
				}
				else
				{
					if(ccl==chk.charAt(i))
					{
						chkpass=true;
						break;
					}
				}
				i++;
			}
			next=no;
			if(chk.charAt(0)=='!')
			{
				if(chkpass)
					chkpass=false;
				else
					chkpass=true;
			}
			if(chkpass)
			{
				next=yes;

			}

		}

	}

}
/*
 rule:	!3(abc)!4(cd){dd}1
 to check:	current letter is not a,b or c and right is not c or d
 decision:	\u0d0a go to 1 letter forward
*/