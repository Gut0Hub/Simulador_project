public class Main {
    public static void main(String[] args) {
        SensorSimulado sensor = new SensorSimulado();

        while (true) {
            float temperatura = sensor.getTemperatura();
            float umidade = sensor.getUmidade();
            int luminosidade = sensor.getLuminosidade();

            System.out.printf("Temperatura: %.2f °C | Umidade: %.2f %% | Luminosidade: %d%n",
                              temperatura, umidade, luminosidade);

            try {
                Thread.sleep(2000); // Espera 2 segundos entre as leituras
            } catch (InterruptedException e) {
                System.out.println("Erro no delay");
            }
        }
    }
}
