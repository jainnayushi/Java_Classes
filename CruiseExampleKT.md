1. StandardCabin : 3instances, 2 methods
2. PremiumCabin extends StandardCabin : +1instance, +1method, @override of 2 methods

: variables : amenities
: methods : services


Methods should be
1.
void func(int a){

}
2.
int func(){
    return ..
}


//    option 1
    @Override
    public String cleanTheRoom(){
        return "Cleaning the Room in premium room";
    }

    //option 2
    public String cleanTheRoomAndChangedCovers(){
        return "Cleaning the Room and Covers Changed";
    }
