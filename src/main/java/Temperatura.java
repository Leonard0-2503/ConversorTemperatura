public class Temperatura {
    //ATRIBUTO PRIVADO PARA ARMAZENAR TEMP- CELSIUS
    private double  tempCelsius;
    
    
    //CONSTRUTOR - CRIAR O OBJETO COM UMA TEMP INICAL
    public Temperatura(double tempInicialCelsius){
       this.tempCelsius = tempInicialCelsius;
    }   
       
        //GETTER- PARA LER A TEMPERATURA
        public double getTemperatura(){
            return tempCelsius;
        }
        
        //SETTER - MUDAR A TEMPERATURA
        
        public void setTemperaturaCelsius(double mudarTempCelsius){
            this.tempCelsius = mudarTempCelsius;
        }
        
        //METODO PARA CONVERTER CELSIUS PARA FAHRENHEIT
        public double converteParaFahrenheit(){
            return tempCelsius*9/5+32;
        }
        //METODO PARA CONVERTER CELSIUS PARA KELVIN
        public double converteParaKelvin(){
            return tempCelsius+273.15;
        }
                
    }
