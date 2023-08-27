public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 1;

    public void mudarCanal(int canal) {
        if (canal <= 0){
            System.out.println("~ nada acontece ~");
        } else {
            this.canal = canal;
        }
    }

    public int abaixarCanal(){
        if (!ligada || (canal == 1)){
            System.out.println("~nada acontece~");
        } else {
            this.canal--;
        }
        return this.canal;
    }

    public int aumentarCanal(){
        if (!ligada){
            System.out.println("TV está desligada.");
        } else {
            this.canal++;
        }
        return this.canal;
    }

    public void ligarTV(){
        this.ligada = true;
    }

    public void desligarTV(){
            this.ligada = false;
        }
    

    public int aumentarVolume(){
        if (!ligada) {
            System.out.println("TV está desligada.");
        } else {
            this.volume++;
        }
        return this.volume;
    }

    public int abaixarVolume(){
        if ((!ligada)|| (volume == 0)) {
            System.out.println("~nada acontece~");
        } else {
            this.volume--;
        }
        return this.volume;
    }

    public void status(){
        System.out.println("LIGADA: " + this.ligada);
        System.out.println("CANAL: " + this.canal);
        System.out.println("VOLUME: " +this.volume);
    }
}