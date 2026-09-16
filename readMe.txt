note there is a bug in the original maintainers release - original maintainer appears to no longer be active

this fork fixes it
https://github.com/zamblauskas/gtfs-filter/tree/time_option_multi_values

this fix has been incorporated into this fork.


See class / inheritance diagram - it is over complicated.

The current implementation requires a number of code changes whenever new fields are added to the specification and the library that this filter is built on top of (org.onebusaway.onebusaway-gtfs), which tend to be breaking changes when that library is updated.

There is another way to implement this that would reduce the likelihood of breaking changes occurring but not had chance to implement and test it.

Owen O'Neill Sept 2026


