import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PlagiarismTest {

    @Test
    public void TheRaven() {
        Detector detector = new Detector("Once upon a midnight dreary, while I pondered, weak and weary", 101);

        assertEquals(0, detector.search("Once upon a midnight dreary, while I pondered, weak and weary,\r\n" +
                        "Over many a quaint and curious volume of forgotten lore—\r\n" +
                        "    While I nodded, nearly napping, suddenly there came a tapping,\r\n" +
                        "As of some one gently rapping, rapping at my chamber door.\r\n" +
                        "“'Tis some visitor,” I muttered, “tapping at my chamber door—\r\n" +
                        "            Only this and nothing more.”\r\n" + //
                        "\r\n" +
                        "    Ah, distinctly I remember it was in the bleak December;\r\n" +
                        "And each separate dying ember wrought its ghost upon the floor.\r\n" +
                        "    Eagerly I wished the morrow;—vainly I had sought to borrow\r\n" +
                        "    From my books surcease of sorrow—sorrow for the lost Lenore—\r\n" +
                        "For the rare and radiant maiden whom the angels name Lenore—\r\n" +
                        "            Nameless here for evermore.\r\n" + //
                        "\r\n" + 
                        "    And the silken, sad, uncertain rustling of each purple curtain\r\n" +
                        "Thrilled me—filled me with fantastic terrors never felt before;\r\n" +
                        "    So that now, to still the beating of my heart, I stood repeating\r\n" +
                        "    “'Tis some visitor entreating entrance at my chamber door—\r\n" +
                        "Some late visitor entreating entrance at my chamber door;—\r\n" +
                        "            This it is and nothing more.”\r\n" +
                        "\r\n" +
                        "    Presently my soul grew stronger; hesitating then no longer,\r\n" +
                        "“Sir,” said I, “or Madam, truly your forgiveness I implore;\r\n" +
                        "    But the fact is I was napping, and so gently you came rapping,\r\n" +
                        "    And so faintly you came tapping, tapping at my chamber door,\r\n" +
                        "That I scarce was sure I heard you”—here I opened wide the door;—\r\n" +
                        "            Darkness there and nothing more.\r\n" + //
                        "\r\n" +
                        "    Deep into that darkness peering, long I stood there wondering, fearing,\r\n" +
                        "Doubting, dreaming dreams no mortal ever dared to dream before;\r\n" +
                        "    But the silence was unbroken, and the stillness gave no token,\r\n" +
                        "    And the only word there spoken was the whispered word, “Lenore?”\r\n" +
                        "This I whispered, and an echo murmured back the word, “Lenore!”—\r\n" +
                        "            Merely this and nothing more."));
    }

    @Test
    public void RichardII() {
        Detector detector = new Detector("Of watery Neptune, is now bound in with shame", 101);

        assertEquals(1008, detector.search("“This royal throne of kings, this scepter'd isle,\r\n" +
                        "This earth of majesty, this seat of Mars,\r\n" +
                        "This other Eden, demi-paradise,\r\n" +
                        "This fortress built by Nature for herself\r\n" +
                        "Against infection and the hand of war,\r\n" +
                        "This happy breed of men, this little world,\r\n" +
                        "This precious stone set in the silver sea,\r\n" +
                        "Which serves it in the office of a wall\r\n" +
                        "Or as a moat defensive to a house,\r\n" +
                        "Against the envy of less happier lands,\r\n" +
                        "This blessed plot, this earth, this realm, this England,\r\n" +
                        "This nurse, this teeming womb of royal kings,\r\n" +
                        "Fear'd by their breed and famous by their birth,\r\n" +
                        "Renowned for their deeds as far from home,\r\n" +
                        "For Christian service and true chivalry,\r\n" +
                        "As is the sepulchre in stubborn Jewry\r\n" +
                        "Of the world's ransom, blessed Mary's Son,\r\n" +
                        "This land of such dear souls, this dear dear land,\r\n" +
                        "Dear for her reputation through the world,\r\n" +
                        "Is now leased out, I die pronouncing it,\r\n" +
                        "Like to a tenement or pelting farm:\r\n" +
                        "England, bound in with the triumphant sea,\r\n" +
                        "Whose rocky shore beats back the envious siege\r\n" +
                        "Of watery Neptune, is now bound in with shame,\r\n" +
                        "With inky blots and rotten parchment bonds:\r\n" +
                        "That England, that was wont to conquer others,\r\n" +
                        "Hath made a shameful conquest of itself.\r\n" +
                        "Ah, would the scandal vanish with my life,\r\n" +
                        "How happy then were my ensuing death!”"));
    }

    @Test
    public void loveSosa() {
        Detector detector = new Detector("These bitches love Sosa", 101);

        assertEquals(714, detector.search("These bitches love Sosa, oh\r\n" + 
                        "And they love them Glo' Boys, oh\r\n" + 
                        "Know we from the 'Go boy, oh\r\n" + 
                        "No one can control us, oh\r\n" + 
                        "\r\n" + 
                        "These bitches love Sosa, oh\r\n" + 
                        "And they love them Glo' Boys, oh\r\n" + 
                        "Know we from the 'Go boy, oh\r\n" + 
                        "No one can control us, oh\r\n" + 
                        "\r\n" + 
                        "Glo Gang, we a bunch of soldiers\r\n" + 
                        "Glo Gang, we a bunch of soldiers\r\n" + 
                        "Glo Gang, we a bunch of soldiers\r\n" + 
                        "Glo Gang, we a bunch of soldiers\r\n" + 
                        "\r\n" + 
                        "These bitches love Sosa\r\n" + 
                        "O end or no end\r\n" ));
                        
    }
    @Test
    public void Nobody() {
        Detector detector = new Detector("Still nobody wants me", 101);

        assertEquals(714, detector.search("I just want to feel alright\r\n" + 
        "So I open the window\r\n" +
        "To hear sounds of people\r\n" +
        "To hear sounds of people\r\n" +
        "Venus, planet of love\r\n" +
        "Was destroyed by global warming\r\n" +
        "Did its people want too much, too?\r\n" +
        "Did its people want too much?\r\n" + 
        "And I don't want your pity\r\n" +
        "I just want somebody near me\r\n" +
        "Guess I'm a coward\r\n" +
        "I just want to feel alright\r\n" +
        "And I know no one will save me\r\n" +
        "I just need someone to kiss\r\n" +
        "Give me one good honest kiss\r\n" +
        "And I'll be alright\r\n" +
        "Nobody, nobody, nobody."));
    }
        
    
    @Test
    public void TheRoadNotTaken() {
        Detector detector = new Detector("And that has made all the difference", 101);

        assertEquals(714, detector.search("Two roads diverged in a yellow wood,\r\n" + 
                        "And sorry I could not travel both\r\n" + 
                        "And be one traveler, long I stood\r\n" + 
                        "And looked down one as far as I could\r\n" + 
                        "To where it bent in the undergrowth;\r\n" + 
                        "\r\n" +
                        "Then took the other, as just as fair,\r\n" + 
                        "And having perhaps the better claim,\r\n" + 
                        "Because it was grassy and wanted wear;\r\n" + 
                        "Though as for that the passing there\r\n" + 
                        "Had worn them really about the same,\r\n" + 
                        "\r\n" +
                        "And both that morning equally lay\r\n" + 
                        "In leaves no step had trodden black.\r\n" + 
                        "Oh, I kept the first for another day!\r\n" + 
                        "Yet knowing how way leads on to way,\r\n" + 
                        "I doubted if I should ever come back.\r\n" + 
                        "\r\n" + 
                        "I shall be telling this with a sigh\r\n" + 
                        "Somewhere ages and ages hence:\r\n" + 
                        "Two roads diverged in a wood, and I—\r\n" + 
                        "I took the one less traveled by,\r\n" + 
                        "And that has made all the difference."));
    }
    
}
