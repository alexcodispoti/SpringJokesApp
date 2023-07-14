package alex.springframework.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

//Implementazione del service Interface
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    //iniettare un'istanza di ChuckNorrisQuotes nel costruttore del Service , non la creo direttamente
    //ma il costruttore inizializzerà su una nuova istanza la new ChuckNorrisQuotes()
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }



    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
