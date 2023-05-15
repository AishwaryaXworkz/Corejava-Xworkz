class Rice
{
  int riceId;
  String type;
  String name;
  double price;
	public Rice(){
		
	}

        public Rice(int riceId,String type,double price){
		System.out.println("rice object is created");
		this.riceId=riceId;
		this.type=type;
		this.price=price;
}
}