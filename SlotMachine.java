public class SlotMachine {
	public static void main(String[] args) {
	    
		String Slot1 = "";
        String Slot2 = "";
        String Slot3 = "";

        int casoSlot1 = (int) (Math.random() * 5) + 1;

        switch (casoSlot1) {
            case 1:
                Slot1 = "corazón";
                break;
            case 2:
                Slot1 = "diamante";
                break;
            case 3:
                Slot1 = "herradura";
                break;
            case 4:
                Slot1 = "tréboles";
                break;
            case 5:
                Slot1 = "tréboles";
                break;
            default:
                break;
        }

        int casoSlot2 = (int) (Math.random() * 5) + 1;

        switch (casoSlot2) {
            case 1:
                Slot2 = "corazón";
                break;
            case 2:
                Slot2 = "diamante";
                break;
            case 3:
                Slot2 = "herradura";
                break;
            case 4:
                Slot2 = "tréboles";
                break;
            case 5:
                Slot2 = "tréboles";
                break;
            default:
                break;
        }
        
        int casoSlot3 = (int) (Math.random() * 5) + 1;

        switch (casoSlot3) {
            case 1:
                Slot3 = "corazón";
                break;
            case 2:
                Slot3 = "diamante";
                break;
            case 3:
                Slot3 = "herradura";
                break;
            case 4:
                Slot3 = "tréboles";
                break;
            case 5:
                Slot3 = "tréboles";
                break;
            default:
                break;
        }
        
        if (Slot1.equals(Slot2) && Slot2.equals(Slot3)) {
            System.out.println(Slot1 + " " + Slot2 + " " + Slot3);
            System.out.println("Enhorabuena, ha ganado 10 monedas");
        } else {
            if (Slot1.equals(Slot2) || Slot2.equals(Slot3) || Slot1.equals(Slot3)) {
            System.out.println(Slot1 + " " + Slot2 + " " + Slot3);
            System.out.println("Bien, ha recuperado su moneda");
            } else {
            System.out.println(Slot1 + " " + Slot2 + " " + Slot3);
            System.out.println("Lo siento, ha perdido");
            }
        }
	}
}
