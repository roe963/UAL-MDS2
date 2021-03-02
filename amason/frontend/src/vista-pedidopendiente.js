import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidopendiente`
 *
 * VistaPedidopendiente element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidopendiente extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-pedidopendiente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidopendiente.is, VistaPedidopendiente);
