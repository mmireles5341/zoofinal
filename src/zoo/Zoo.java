package zoo;

import java.util.Scanner;

/**
 *
 * @author mmireles5341
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Bob =  new Scanner(System.in);
         Quablaze Quablaze = new Quablaze();
         LaFlame LaFlame = new LaFlame();
         FieryYe FieryYe = new FieryYe();
         TinderMalone TinderMalone = new TinderMalone();
         CaitswimJenner CaitswimJenner = new CaitswimJenner();
         KimKarsplashian KimKarsplashian = new KimKarsplashian();
         KhloceanKardashian KhloceanKardashian = new KhloceanKardashian();
         KrisH2OJenner KrisH2OJenner = new KrisH2OJenner(); 
         SnoopFogg SnoopFogg = new SnoopFogg();
         BobMairley BobMairley = new BobMairley();
         WizKhaflya WizKhaflya = new WizKhaflya(); 
         WakaFlockaFlame WakaFlockaFlame = new WakaFlockaFlame();
         
        int choice;
        String SectionChoice = "What section would you like to see first?\n" 
                + "\n1: Fire Nation"
                + "\n2: Water Tribe"
                + "\n3: Air Nomads";
        String FireNation = "Welcome to the Super class La Flame!\n"; 
        String FireNation2 = "\nWhat would you like to see next?"
                + "\n1: Fiery Ye"
                + "\n2: Tinder Malone"
                + "\n3: Quablaze";
        String WaterTribe = "Welcome to the Super class Caitswim Jenner !\n";
        String WaterTribe2 = "\nWhat would you like to see next?"
                + "\n1: Kim Karsplashian"
                + "\n2: Khlocean Kardashian"
                + "\n3: Kris H2O Jenner";
        String AirNomads = "Welcome to the Super class of Snoop Fogg!\n"; 
         String AirNomads2 = "\nWhat would you like to see next?"
                + "\n1: Bob Mairley"
                + "\n2: Wiz Khaflya"
                + "\n3: Waka Flocka Flame";
        System.out.println(SectionChoice);
        choice = Bob.nextInt();
        switch(choice){
            case 1: System.out.println(FireNation);
                    LaFlame.Carnivore();
                     LaFlame.Color();
                     LaFlame.EyeColor();
                     LaFlame.Burn();
                     LaFlame.Attack();
                     LaFlame.ThermalImaging();
                System.out.println(FireNation2);
         choice = Bob.nextInt();
                    switch(choice){
                        case 1: FieryYe.HotHead();
                                FieryYe.EyeColor();
                                FieryYe.UltralightBeams();
                                FieryYe.Food();
                                FieryYe.Attention();
                                FieryYe.WaterCreature();
                                break;
                        case 2: TinderMalone.Color();
                                TinderMalone.StartFire();
                                TinderMalone.Small();
                                TinderMalone.SpitFire();
                                TinderMalone.Plays();
                                TinderMalone.Hunt();
                                break;
                        case 3: Quablaze.Yellow();
                                Quablaze.Mammal();
                                Quablaze.Nocturnal();
                                Quablaze.Hunt();
                                Quablaze.Migrate();
                                Quablaze.Sleeps();
                    }
//>>>>>>> origin/master
                   break;
            case 2: System.out.println(WaterTribe);
                 CaitswimJenner.BreatheInWater();
                      CaitswimJenner.RepellentSkin();
                      CaitswimJenner.EyeColor();
                      CaitswimJenner.Hurricanes();
                      CaitswimJenner.Dehydrate();
                      CaitswimJenner.WaterTemp();
                System.out.println(WaterTribe2);
                    choice = Bob.nextInt();
                    switch(choice){
                        case 1: KimKarsplashian.Respected();
                                KimKarsplashian.Attention();
                                KimKarsplashian.ReallyMoody();
                                KimKarsplashian.Cries();
                                KimKarsplashian.Sleeps();
                                KimKarsplashian.WaterTemp();
                                break;
                        case 2: KhloceanKardashian.Tall();
                                KhloceanKardashian.FakeBlonde();
                                KhloceanKardashian.Tsunami();
                                KhloceanKardashian.Brag();
                                KhloceanKardashian.Clothes();
                                KhloceanKardashian.Swim();
                                break;
                        case 3: KrisH2OJenner.Hair();
                                KrisH2OJenner.Gills();
                                KrisH2OJenner.Kids();
                                KrisH2OJenner.Meeting();
                                KrisH2OJenner.Clothes();
                                KrisH2OJenner.Swim();
                    }
                   break;
            case 3: System.out.println(AirNomads);
                 SnoopFogg.Flock();
                      SnoopFogg.Fly();
                      SnoopFogg.EyeColor();
                      SnoopFogg.Tails();
                      SnoopFogg.Wind();
                      SnoopFogg.Tornado();
                System.out.println(AirNomads2);
                     choice = Bob.nextInt();
                     switch(choice){
                        case 1: BobMairley.Jamaica();
                                BobMairley.Hair();
                                BobMairley.Feathers();
                                BobMairley.Fly();
                                BobMairley.Music();
                                BobMairley.StopWind();
                            break;
                        case 2: WizKhaflya.Hopeless();
                                 WizKhaflya.Herbivore();
                                 WizKhaflya.HighestFlier();
                                 WizKhaflya.Sunglasses();
                                 WizKhaflya.Roses();
                                 WizKhaflya.Chains();
                            break;
                        case 3: WakaFlockaFlame.Friend();
                                WakaFlockaFlame.RedFeathers();
                                WakaFlockaFlame.NoHands();
                                WakaFlockaFlame.Fly();
                                WakaFlockaFlame.Eat();
                                WakaFlockaFlame.Rap();
                            
                    }
                   break;
            default: System.out.println("Please retry");
                   break;
                   
        }
    }
    
}
