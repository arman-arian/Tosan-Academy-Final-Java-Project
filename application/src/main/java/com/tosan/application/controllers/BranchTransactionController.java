package com.tosan.application.controllers;

import com.tosan.application.extensions.errors.ControllerErrorParser;
import com.tosan.application.extensions.thymeleaf.Layout;
import com.tosan.core_banking.services.TransactionService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/branch_transaction")
@Layout(title = "Branch Transactions", value = "layouts/default")
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class BranchTransactionController {
    private final TransactionService _transactionService;

    public BranchTransactionController(TransactionService transactionService) {
        _transactionService = transactionService;
    }

    @GetMapping({"/","/index"})
    public String loadForm(Model model) {
        try {
            var transactionDtoList = _transactionService.loadLastBranchTransactions();
            model.addAttribute("transactionDtoList", transactionDtoList);

            return "views/admin/branch_transaction";
        } catch (Exception ex) {
            return "redirect:/branch_transaction/index?error=" + ControllerErrorParser.getError(ex);
        }
    }
}
