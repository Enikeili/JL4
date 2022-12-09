package Entitys;

/**
 * Class Man with fields: id, name, gender, division, salary and birthday
 * @author enikeili
 */
public class Man
{
	private int id;
	private String name;
	private Gender gender;
	private Division division;
	private int salary;
	private String birthday;
	/**
	 * Default constructor for a Man class object
	 */
	public Man()
	{
		this.id=0;
		this.name="";
		this.gender=null;
		this.division = new Division();
		this.salary=0; 
		this.birthday="";
	}
	/**
	 * Constructor with parameters for a Man class object
	 * @param _id the man id
	 * @param _name the man name
	 * @param _gender the man gender
	 * @param div_name the division name
	 * @param _salary the man salary
	 * @param _birthday the man birthday
	 */
	public Man(int _id, String _name, Gender _gender, String div_name, int _salary, String _birthday)
	{
		this.id=_id;
		this.name=_name;
		this.gender=_gender;
		this.division = new Division(div_name);
		this.salary=_salary; 
		this.birthday=_birthday;
	}
	/**
	 * Getter for the man id
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * Setter for the man id
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * Getter for the man name
	 * @return the man name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Setter for the man name
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * Getter for the man gender
	 * @return the man gender
	 */
	public Gender getGender()
	{
		return gender;
	}
	/**
	 * Setter for the man gender
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	/**
	 * Getter for the man division
	 * @return the man division
	 */
	public Division getDivision()
	{
		return division;
	}
	/**
	 * Setter for the man division
	 * @param division the division to set
	 */
	public void setDivision(Division division)
	{
		this.division = division;
	}
	/**
	 * Getter for the man salary
	 * @return the man salary
	 */
	public int getSalary()
	{
		return salary;
	}
	/**
	 * Setter for the man salary 
	 * @param salary the salary to set
	 */
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	/**
	 * Getter for the man birthday
	 * @return the man birthday
	 */
	public String getBirthday()
	{
		return birthday;
	}
	/**
	 * Setter for the man birthday
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday)
	{
		this.birthday = birthday;
	}
    public boolean isEmpty()
    {
        return this.getId() != 0 && this.getName() != null && this.getGender() != null && this.getBirthday() != null && this.getDivision() != null && this.getSalary() != 0;
    }
}
