import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BonusTest2 {

    @Test
    public void Tulips() {
        Detector detector = new Detector("Tulips are gorgeous in the spring", 79);

        assertEquals(-1, detector.search("The tulips are too excitable, it is winter here.\r\n" +
                        "Look how white everything is, how quiet, how snowed-in.\r\n" +
                        "I am learning peacefulness, lying by myself quietly\r\n" +
                        "As the light lies on these white walls, this bed, these hands.\r\n" +
                        "I am nobody; I have nothing to do with explosions.\r\n" +   
                        "I have given my name and my day-clothes up to the nurses\r\n" +
                        "And my history to the anesthetist and my body to surgeons.\r\n" +
                        "\r\n" +
                        "They have propped my head between the pillow and the sheet-cuff\r\n" +
                        "Like an eye between two white lids that will not shut.\r\n" +
                        "Stupid pupil, it has to take everything in.\r\n" +
                        "The nurses pass and pass, they are no trouble,\r\n" +
                        "They pass the way gulls pass inland in their white caps,\r\n" +
                        "Doing things with their hands, one just the same as another,\r\n" + 
                        "So it is impossible to tell how many there are.\r\n" +
                        "\r\n" +
                        "My body is a pebble to them, they tend it as water\r\n" +
                        "Tends to the pebbles it must run over, smoothing them gently.\r\n" +
                        "They bring me numbness in their bright needles, they bring me sleep.\r\n" +   
                        "Now I have lost myself I am sick of baggage——\r\n" +
                        "My patent leather overnight case like a black pillbox,\r\n" +   
                        "My husband and child smiling out of the family photo;\r\n" +   
                        "Their smiles catch onto my skin, little smiling hooks.\r\n" +
                        "\r\n" +
                        "I have let things slip, a thirty-year-old cargo boat\r\n" + 
                        "stubbornly hanging on to my name and address.\r\n" +
                        "They have swabbed me clear of my loving associations.\r\n" +  
                        "Scared and bare on the green plastic-pillowed trolley\r\n" + 
                        "I watched my teaset, my bureaus of linen, my books\r\n" +
                        "Sink out of sight, and the water went over my head.\r\n" +
                        "I am a nun now, I have never been so pure.\r\n" +
                        "\r\n" +
                        "I didn't want any flowers, I only wanted\r\n" +
                        "To lie with my hands turned up and be utterly empty.\r\n" +
                        "How free it is, you have no idea how free——\r\n" +
                        "The peacefulness is so big it dazes you,\r\n" +
                        "And it asks nothing, a name tag, a few trinkets.\r\n" +
                        "It is what the dead close on, finally; I imagine them\r\n" +   
                        "Shutting their mouths on it, like a Communion tablet.\r\n" +   
                        "\r\n" +
                        "The tulips are too red in the first place, they hurt me.\r\n" +
                        "Even through the gift paper I could hear them breathe\r\n" + 
                        "Lightly, through their white swaddlings, like an awful baby.\r\n" +   
                        "Their redness talks to my wound, it corresponds.\r\n" +
                        "They are subtle : they seem to float, though they weigh me down,\r\n" +   
                        "Upsetting me with their sudden tongues and their color,\r\n" +
                        "A dozen red lead sinkers round my neck.\r\n" +
                        "\r\n" +
                        "Nobody watched me before, now I am watched.\r\n" + 
                        "The tulips turn to me, and the window behind me\r\n" +
                        "Where once a day the light slowly widens and slowly thins,\r\n" + 
                        "And I see myself, flat, ridiculous, a cut-paper shadow\r\n" + 
                        "Between the eye of the sun and the eyes of the tulips,\r\n" +  
                        "And I have no face, I have wanted to efface myself.\r\n" +   
                        "The vivid tulips eat my oxygen.\r\n" +
                        "\r\n" +
                        "Before they came the air was calm enough,\r\n" +
                        "Coming and going, breath by breath, without any fuss.\r\n" +   
                        "Then the tulips filled it up like a loud noise.\r\n" +
                        "Now the air snags and eddies round them the way a river\r\n" +   
                        "Snags and eddies round a sunken rust-red engine.\r\n" +   
                        "They concentrate my attention, that was happy\r\n" +  
                        "Playing and resting without committing itself.\r\n" +
                        "\r\n" +
                        "The walls, also, seem to be warming themselves.\r\n" +
                        "The tulips should be behind bars like dangerous animals;\r\n" +   
                        "They are opening like the mouth of some great African cat,\r\n" +   
                        "And I am aware of my heart: it opens and closes\r\n" +
                        "Its bowl of red blooms out of sheer love of me.\r\n" +
                        "The water I taste is warm and salt, like the sea,\r\n" +
                        "And comes from a country far away as health."));
    }
}