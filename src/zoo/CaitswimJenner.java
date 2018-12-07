package zoo;

/**
 *
 * @author mmireles5341
 */
class CaitswimJenner {
    private String EyeColor = "ice blue";
    private boolean BreathinWater = true;
    private boolean RepellentSkin = true;
   
    
    public static void BreatheInWater()
    {
        System.out.println("I'm the super cool superclass lol and I breathe in water ALL THE TIME!");
    }
    
    public void EyeColor()
    {
        System.out.println("MY EYECOLOR IS " + getEyeColor() + " it's the cooooliest");
    }
    public static void RepellentSkin()
    { 
        System.out.println("My skin repels water... it slides RIGHT OFF!");
    }  
    
    public void Hurricanes(){
        System.out.println("DON'T EVEN TRY TO MAKE ME ANGRY OR I WILL THROW YOU IN MY VERY OWN HURRICANE... or tsunami depending on the weather");
    }
    
    public void Dehydrate(){
        System.out.println("If you're my prey, be prepared to have the water SUCKED OUT OF YOU... and then I will eat you yay *dolphin noise*");
    }
    
    public void WaterTemp(){
        System.out.println("If you haven't noticed, I get really emotional, so I change the water temperature around me depending on my mood... it's a cool party trick!");
    }

    /**
     * @return the EyeColor
     */
    public String getEyeColor() {
        return EyeColor;
    }

    /**
     * @return the BreathinWater
     */
    public boolean isBreathinWater() {
        return BreathinWater;
    }

    /**
     * @return the RepellentSkin
     */
    public boolean isRepellentSkin() {
        return RepellentSkin;
    }
    
}
