package Entitys;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Class Division with fields id, name
 * @author enikeili
 */
public class Division
{
	private long id;
	private String name;
	private static AtomicLong idCounter = new AtomicLong();
	/**
	 * Default constructor for a Division class object
	 */
	public Division()
	{
		this.id=0;
		this.name="";
	}
	/**
	 * Constructor with parameter for a Division class object
	 * @param _name the division name
	 */
	public Division(String _name)
	{
		this.id=Long.valueOf(idCounter.getAndIncrement());
		this.name=_name;
	}
	/**
	 * Getter for the division id
	 * @return the division id
	 */
	public long getId()
	{
		return id;
	}
	/**
	 * Setter for the division id
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * Getter for the division name
	 * @return the division name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Setter for the division name
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "[" + id + ", " + name + "]";
	}
}
