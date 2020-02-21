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

        newJokes.add(new Joke("Het is Blauw en weegt niet veel", "Lichtblauw"));
        newJokes.add(new Joke("Het is zwart en als het uit een boom valt is uw kachel kapot", "uw kachel"));
        newJokes.add(new Joke("Het is grijs en als het in uw oog vliegt zijt ge dood", "een Boeing"));
        newJokes.add(new Joke("Have you heard about the german sausage?", "it was the Wurst"));

        jokes.setValue(newJokes);
    }

}
