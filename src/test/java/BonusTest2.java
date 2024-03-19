import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BonusTest2 {
    @Test
    public void GreatGatsby()
    {
        Detector detector = new Detector("So we beat on, boats against the current, borne back ceaselessly into the past.", 79);

        assertEquals(-1, detector.search("Most of the big shore places were closed now \r\n" +
        "and there were hardly any lights except the shadowy, \r\n" +
        "moving glow of a ferryboat across the Sound. \r\n" +
        "And as the moon rose higher the inessential houses began to melt away \r\n" +
        "until gradually I became aware of the old island here \r\n" +
        "that flowered once for Dutch sailors’ eyes—a fresh, green breast of the new world. \r\n" +
        "Its vanished trees, the trees that had made way for Gatsby’s house,\r\n" +
        "had once pandered in whispers to the last and greatest of all human dreams; \r\n" +
        "for a transitory enchanted moment man must have held his breath in the presence of this continent, \r\n" +
        "compelled into an æsthetic contemplation he neither understood nor desired, \r\n" +
        "face to face for the last time in history with something commensurate to his capacity for wonder.\r\n" +
        "And as I sat there, brooding on the old unknown world, I thought of Gatsby’s wonder \r\n" +
        "when he first picked out the green light at the end of Daisy’s dock. \r\n" +
        "He had come a long way to this blue lawn and his dream must have seemed so close  \r\n" +
        "that he could hardly fail to grasp it. He did not know that it was already behind him, \r\n" +
        "somewhere back in that vast obscurity beyond the city, where the dark fields of the republic rolled on under the night. \r\n" +
        "Gatsby believed in the green light, the orgastic future that year by year recedes before us. \r\n" +
        "It eluded us then, but that’s no matter—tomorrow we will run faster, stretch out our arms farther \r\n" +
        ". . . . And one fine morning—— \r\n" +
        "So we beat on, boats against the current, borne back ceaselessly into the past."));
    }
    
}