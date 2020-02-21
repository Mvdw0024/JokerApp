package be.ehb.jokerapp.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;


public class JokeViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Joke>> jokes;

    public MutableLiveData<ArrayList<Joke>> getJokes() {
        if (jokes == null) {
            jokes = new MutableLiveData<>();
            loadJokes();
        }
        return jokes;
    }

    //in het echt komt dit uit een backend of database
    private void loadJokes() {
        ArrayList<Joke> newJokes = new ArrayList<>();

        newJokes.add(new Joke("Het is blauw en weegt niet veel?", "Lichtblauw"));
        newJokes.add(new Joke("Het is zwart en als het uit een boom valt is uw kachel kapot?", "uw kachel"));
        newJokes.add(new Joke("Het is grijs en als het in uw oog vliegt zijt ge dood?", "een Boeing"));
        newJokes.add(new Joke("Have you heard about the german sausage?", "it was the Wurst!"));
        newJokes.add(new Joke("What do you call the security outside of a Samsung Store?", "Guardians of the Galaxy"));
        newJokes.add(new Joke("What do we call a crying sister?\n", "a crisis"));
        newJokes.add(new Joke("Why was the stadium so cold?", "There were a lot of fans"));
        newJokes.add(new Joke("What are the strongest days of the week?", "Saturday and Sunday the rest are week days."));
        newJokes.add(new Joke("I have a lot of good jokes about unemployed people...", "but none of them work"));
        newJokes.add(new Joke("Why can't a bike stand up on it's own?", "Because it's two tired"));
        newJokes.add(new Joke("My friend David lost his ID.", "Now I call him Dav"));
        newJokes.add(new Joke("What is the slipperiest country in the world?", "Greece"));
        newJokes.add(new Joke("Why doesn't Pac-Man use Twitter?", "He doesn't like being followed..."));
        newJokes.add(new Joke("Have you ever watched the movie \"Constipated\"?", "It hasn't come out yet"));
        newJokes.add(new Joke("What do you call a sad cup of coffee?", "a Depresso"));
        newJokes.add(new Joke("What did the buffalo say to his son when he left for college?", "Bison"));
        newJokes.add(new Joke("What do you call a boomerang that doesn't come back?", "a stick..."));
        newJokes.add(new Joke("What did the vegetables say at the party?", "Lettuce turnip the beet!"));





        jokes.setValue(newJokes);
    }

}
