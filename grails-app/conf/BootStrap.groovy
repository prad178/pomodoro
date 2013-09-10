import org.example.pomodoro.Tag
import org.example.pomodoro.Task

class BootStrap {

    def init = { servletContext ->
		def workTag = new Tag(name: "Work").save(failOnError: true)
		def homeTag = new Tag(name: "Home").save(failOnError: true)
		def decideTag = new Tag(name: "Decide").save(failOnError: true)
		
		def task1 = new Task(
			summary: "Do 2nd intro screencast",
			details: "Create the second intro screencast for Grails",
			status: "Open",
			deadline: new Date() - 1)
		task1.addToTags(workTag)
		task1.addToTags(homeTag)
		task1.save(faileOnError: true)
		
		def task2 = new Task(
			summary: "Decide whether to continue with screencast",
			details: "Study Grails 2 book and practice at home. \nThis is the test for new line.",
			status: "Open",
			deadline: new Date())
		task2.addToTags(workTag)
		task2.addToTags(decideTag)
		task2.save(faileOnError: true)
		
		def task3 = new Task(
			summary: "Complete grails tutorial",
			details: "Complete studying book and practicing",
			status: "Open",
			deadline: new Date() + 1)
		task3.addToTags(workTag)
		task3.addToTags(homeTag)
		task3.save(faileOnError: true)
		
		def task4 = new Task(
			summary: "Shopping",
			details: "Go to grocery store and buy vegetables.",
			status: "Open",
			deadline: new Date() + 7)
		task4.addToTags(homeTag)
		task4.save(faileOnError: true)
    }
    def destroy = {
    }
}
