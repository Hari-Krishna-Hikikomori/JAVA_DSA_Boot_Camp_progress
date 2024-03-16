package OOPS.Interface.OverrideIssue;

// both are reference come from Interface type Interface but methods are create in the implementation   ex:-
// where the implementations are existed that method will run                                                  engine interface have Stop method
// in order to run we need to create serrate class and use the Implement                                   and MediaPlayer all so have Stop method
public class Car                                                                                         //  problem comes when we implement them
{                                                                                                        //  same class(car) and Start will be implemented - Stop(){engine off}
    private Engine engine;                                                                               //car obj = new car()     MediaPlayer obj2 = new car()
    private MediaPlayer music;                                                                           //obj.Stop()  && obj2.stop both output "Engine off"
    
    Car()
    {
       engine = new FuelEngine();
       music = new Sonyplayer();
    }
    public void Start() {
        engine.Start();
    }
    public void Stop()
    {
        engine.Stop();
    }

   
    public void Accelerate() {
        engine.Accelerate();
    }

   
    public void brake() {
       engine.brake();
    }

   
    public void PowerSource()
    {
       engine.PowerSource();
    }

    void MusicStart()
    {
        music.Start();
    }
    void MusicStop()
    {
        music.Stop();
    }

    void UpgradeEngine(Engine obj)
    {
        engine = obj;
    }
}
