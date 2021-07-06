import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bloco2 {
    public static void main(String[] args) {
        //falta os consumers
     

        //funcition
        Function<String,Integer> converteStringParaInteiro = Integer::valueOf;
        System.out.println(2 + converteStringParaInteiro.apply("123"));

        //Predicate<String> estaVazio = valor -> valor.isEmpty(); METODO INICIAL LAMBDA
        Predicate<String> estaVazio = String::isEmpty;          //METODO NOVO
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("jura"));

        //supridores
        Supplier<Pessoa> sup = Pessoa::new;
        //Supplier<Pessoa> sup = () -> new Pessoa();
        System.out.println(sup.get());

        //interações
        String[] nomes = {"jao","maria", "pedro"};
        String impStream = Stream.of(nomes).filter(nome -> nome.equals("pedro")).collect(Collectors.joining());
        System.out.println("saida: " + impStream);
        //imprimir todos
        Stream.of(nomes).forEach(System.out::println);

        //numeros

        Integer[] nums = {1,2,3,4,5};
        Stream.of(nums).map(num -> num*2).forEach(System.out::println);

        //Parte final

        List<String> profissoes = new ArrayList<>();
        profissoes.add("dev");
        profissoes.add("tester");
        profissoes.add("gerente de tudo");

        profissoes.stream().filter(profissao -> profissao.startsWith("gerente")).forEach(System.out::println);
        profissoes.stream().forEach(System.out::println);
    }
}

class Pessoa{
    public String toString(){
        return String.format("joão "+ 12);
    }
}