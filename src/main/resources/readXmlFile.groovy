
import org.camunda.commons.utils.IoUtil

xmlData = IoUtil.fileAsString('example.xml')
execution.setVariable('customers', xmlData)

println 'Input XML:'
println xmlData