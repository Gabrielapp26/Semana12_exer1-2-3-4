public class Teste{
    public static void main(String args[]){
        //criação do objeto empregado
        Empregado empregado = new Empregado();
        empregado.setCodigoSetor(1);
        empregado.setSalarioBase(1000);
        empregado.setImposto(100);
        empregado.setNome("Rosa - Luan - Eric - Samuel - Gabrielas - Felipes");
        empregado.setEndereco("Pompeia - Pompeia - Quintana - Oriente - Marília - Tupã");
        empregado.setTelefone("Todos com o código da área 14");
        //apresentação do salário Líquido
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println("Salário Líquido de R$ "+empregado.calcularSalario());
}
}