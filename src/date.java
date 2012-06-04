public class date {

	int newId;
	int newVal;
	String newType;
	
	public date(int id, int val, String typ)
   	{
	  	newId = id;
		newVal = val;
	  	newType = typ;
   	}
	public void setDate(int id, int val, String typ)
   	{
	  	newId = id;
		newVal = val;
	  	newType = typ;
   	}
	public int getDateId()
   	{
	  	return newId;
   	}
	public int getDateValue()
   	{
	  	return newVal;
   	}
	public String getDateType()
   	{
	  	return newType;
   	}
	public void setDateId(int id)
   	{
		newId = id;
   	}
	public void setDateValue(int val)
   	{
		newVal = val;
   	}
	public void setDateType(String typ)
   	{
		newType = typ;
   	}
}
