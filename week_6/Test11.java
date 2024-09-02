/*Implement the below Diagram
*/

class Vehicle {
	private int id;
	private String name;
	private int LicenseNum;
	public Vehicle(int id,String name, int LicenseNum){
		setId(id);
		setName(name);
		setLicenseNum(LicenseNum);	}
	public int getId() {
		return id;	}
	public void setId(int id) {
		this.id = id;	}
	public String getName() {
		return name;	}
	public void setName(String name) {
		this.name = name;	}
	public int getLicenseNum() {
		return LicenseNum;	}
	public void setLicenseNum(int licenseNum) {
		LicenseNum = licenseNum;	}}

class TwoWheeler extends Vehicle{
	private int SteeringHandle;
	public TwoWheeler(int id,String name, int LicenseNum,int SteeringHandle){
		super(id,name,LicenseNum);
		setSteeringHandle(SteeringHandle);	}
	public int getSteeringHandle() {
		return SteeringHandle;	}
	public void setSteeringHandle(int steeringHandle) {
		SteeringHandle = steeringHandle;	}
	public void display(){
		System.out.println("Id= "+this.getId()+"\nName="+this.getName()+"\nLicense Number="+this.getLicenseNum()+"\nSteering Handle="+this.getSteeringHandle()+"\n"); 	}}

class FourWheeler extends Vehicle {
	private int SteeringWheel;
	public FourWheeler(int id,String name, int LicenseNum,int SteeringWheel){
		super(id,name,LicenseNum);
		setSteeringWheel(SteeringWheel);	}
	public int getSteeringWheel() {
		return SteeringWheel;	}
	public void setSteeringWheel(int steeringWheel) {
		SteeringWheel = steeringWheel;	}
	public void display(){
		System.out.println("Id= "+this.getId()+"\nName="+this.getName()+"\nLicense Number="+this.getLicenseNum()+"\nSteering Wheel="+this.getSteeringWheel());	}}

public class Test11 {
	public static void main(String[] args) {
       TwoWheeler tw =new TwoWheeler(128495,"Bike",670345,1);
       FourWheeler fw =new FourWheeler(748495,"Car",840335,1);
System.out.println("For Two-wheeler:\n");
tw.display();
System.out.println("For Four-wheeler:\n");
fw.display();	}}








