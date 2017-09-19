exports.config = {
  framework: 'jasmine',
  seleniumAddress: 'http://localhost:4444/wd/hub',
  specs: ['todo-spec.js'],

capabilities: {
    browserName: 'firefox'
  },
    
    
framework: 'jasmine2' ,
onPrepare: function() {
    var jasmineReporters = require('/Users/dnreddy/node_modules/jasmine-reporters');
    jasmine.getEnv().addReporter(new jasmineReporters.JUnitXmlReporter({
                                                                       consolidateAll: true,
                                                                       savePath: 'testresults',
                                                                       filePrefix: 'xmloutput'
                                                                       }));
}
    
    
    
}
