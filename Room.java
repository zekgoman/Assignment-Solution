
package ie.lyit.hotel;

public class Room{
	private String MaxAdults;			
	private String MaxKids;					
	private String PricePerNight;
	private Date date;						
	private Time time;						
	private double price;

	
	public Room(){
		MaxAdults=MaxKids=PricePerNight="";
		date = new Date();
		time = new Time();
 		price = 0.0;
	}
  				   

	public Room(String MaxAdults, String MaxKids, String PricePerNight, Date date, Time time, double price){

		this.MaxAdults=MaxAdults;
		this.MaxKids=MaxKids;
		this.PricePerNight=PricePerNight;
		this.date=date;
		this.time=time;
		this.price=price;
	}
				

	public String toString(){
		return "Room " + MaxAdults + " ==> "+MaxKids+" to "+PricePerNight+" " + date+" "+time",";
	}
					

   public boolean equals(Object obj){
	    Room fObject;
	   	if (obj instanceof Room)
	   		fObject = (Room)obj;
	   	else
	   		return false;

	   return this.MaxAdults.equals(fObject.MaxAdults) &&
              this.MaxKids.equals(fObject.MaxKids) &&
		      this.PricePerNight.equals(fObject.PricePerNight) &&							
		      this.date.equals(fObject.date) &&
		      this.time.equals(fObject.time);							
	}
   
	// set() and get() methods
	public void setMaxAdults(String MaxAdults){
	    this.MaxAdults=MaxAdults;
	}
	public String getMaxAdults(){
	   return MaxAdults;
    }
   public void setMaxKids(String MaxKids){
	    this.MaxKids=MaxKids;
	}
	public String getMaxKids(){
	    return MaxKids;
    }
    public void setPricePerNight(String PricePerNight){
       this.PricePerNight=PricePerNight;
    }
    public String getPricePerNight(){
       return PricePerNight;
    }
    public void setDate(Date date){
       this.date=date;
    }
    public Date getDate(){
       return date;
    }
    public void setTime(Time time){
       this.time=time;
    }
    public Time getTime(){
       return time;
    }
    public void setPrice(double price){
       this.price=price;
    }
    public double getPrice(){
       return price;
    }
}

