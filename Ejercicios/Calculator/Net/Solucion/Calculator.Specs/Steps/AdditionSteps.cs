using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Calculator.Library;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using TechTalk.SpecFlow;

namespace Calculator.Specs.Steps
{
    [Binding]
    public class AdditionSteps
    {
        Calc calculator=new Calc();
        private int resultCalculator = 0;

        [Given(@"I have entered (.*) into the calculator")]
        public void GivenIHaveEnteredIntoTheCalculator(int number)
        {
            calculator.Enter(number);
        }
        
        [When(@"I press add")]
        public void WhenIPressAdd()
        {
            resultCalculator = calculator.Add();
        }
        
        [Then(@"the result should be (.*) on the screen")]
        public void ThenTheResultShouldBeOnTheScreen(int result)
        {
            Assert.AreEqual(result, resultCalculator);
        }

    }
}
