.PHONY: up
up:
	gradle bootRun

# .PHONY: stop
# stop:
# 	docker-compose stop

# .PHONY: down
# down:
# 	docker-compose down

.PHONY: all-clean
all-clean:
	gradle clean
# 	-docker stop $$(docker ps -a -q)
# 	-docker rm -f $$(docker ps -a -q)
# 	-docker rmi -f $$(docker images -q)
# 	-docker volume rm $$(docker volume ls -q)

# .PHONY: migrate
# migrate:
# 	docker-compose exec app bundle exec rake db:create db:migrate RAILS_ENV=$(RAILS_ENV)

# .PHONY: restart-app
# restart-app:
# 	docker-compose exec app kill -s USR2 `cat tmp/pids/server.pid`

# # <C-c> や <C-d> で抜けようとすると、appのプロセスごと死ぬので
# # デフォルトのデタッチコマンドである <C-p> + <C-q> でデタッチしてください
# .PHONY: attach-app
# attach-app:
# 	docker attach app_1

# .PHONY: ps
# ps:
# 	docker-compose ps

# .PHONY: shell
# shell:
# 	docker-compose exec app bash

# .PHONY: tailf
# tailf:
# 	docker-compose logs -f
