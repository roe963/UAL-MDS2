import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidos`
 *
 * VistaPedidos element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidos extends PolymerElement {

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
        return 'vista-pedidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidos.is, VistaPedidos);
