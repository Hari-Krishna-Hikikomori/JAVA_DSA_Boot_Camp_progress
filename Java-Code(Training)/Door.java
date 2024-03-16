    public class Door {
        public void open ()
        {
            push();
        }

        public void push() {
        }
    }

    class BankVaultDoor extends Door {

        public void open () {
            enterCombination();
            pull();
        }

        private void pull() {
        }

        private void enterCombination() {
        }

    }

    class HouseFrontDoor extends Door {

        public void open () {
            insertKeyAndTurnKnob();
            super.push();
        }

        private void insertKeyAndTurnKnob() {
        }

    }
