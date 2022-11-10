using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace YouTubeDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Ioc Container
            Person person = new Person();
            person.FirstName = "Kutay";
            person.LastName = "Gezer";
            CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
            customerManager.Save();
            Console.WriteLine(person.FirstName + " " + person.LastName);
            customerManager.GiveCredit();
            MilitaryCreditManager militaryCreditManager = new MilitaryCreditManager();
            militaryCreditManager.Save();
        }
    }

    class CreditManager
    {
        public void Calculate()
        {
            Console.WriteLine("Hesaplandı");
        }

        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }
    }

    interface ICrediManager
    {
        void Calculate();

        void Save();
    }

    abstract class BaseCreditManager : ICrediManager
    {
        public abstract void Calculate();

        public virtual void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }

    class TeacherCreditManager : BaseCreditManager, ICrediManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Öğretmen kredisi hesaplandı");
        }

        public override void Save()
        {
            //
            base.Save();
            //
        }
        //DRY Save()
    }

    class MilitaryCreditManager : BaseCreditManager, ICrediManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandı");
        }
        //DRY Save()
    }

    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Müşteri nesnesi başlatıldı");
        }
        public int Id { get; set; }

        public string City { get; set; }
    }

    class Person : Customer
    {
        public string FirstName { get; set; }

        public string LastName { get; set; }
        public string NationalIdentity { get; set; }

    }

    class Company : Customer
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }

    }

    class CustomerManager
    {
        private Customer _customer;
        ICrediManager _creditManager;
        public CustomerManager(Customer customer, ICrediManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Müşteri kaydedildi : ");
        }
        public void Delete()
        {
            Console.WriteLine("Müşteri silindi : ");
        }

        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi");
        }
    }
}
